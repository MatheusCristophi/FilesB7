package com.matheus.filesB7.files.service;

import com.matheus.filesB7.devices.model.DeviceModel;
import com.matheus.filesB7.files.model.FilesModel;
import com.matheus.filesB7.files.repository.FilesRepository;
import com.matheus.filesB7.transferHistory.enums.TransferStatus;
import com.matheus.filesB7.transferHistory.enums.TransferType;
import com.matheus.filesB7.transferHistory.model.TransferHistoryModel;
import com.matheus.filesB7.transferHistory.repository.TransferHistoryRepository;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.UUID;

@Service
public class FileService {

    private final FilesRepository filesRepository;

    private final TransferHistoryRepository historyRepository;

    public FileService(FilesRepository filesRepository, TransferHistoryRepository historyRepository) {
        this.filesRepository = filesRepository;
        this.historyRepository = historyRepository;
    }

    private final String rootPath = "C:/uploads/";

    public List<FilesModel> getAll(){
        return filesRepository.findAll();
    }

    public Resource downloadFile(UUID id, DeviceModel deviceModel) {
        FilesModel entity = filesRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Arquivo não encontrado"));

        Path path = Paths.get(entity.getStorageReference());
        Resource resource = new FileSystemResource(path);

        if (!resource.exists() || !resource.isReadable()) {
            throw new RuntimeException("Arquivo não encontrado no servidor ou sem permissão de leitura");
        }

        registrarHistorico(entity, deviceModel, TransferType.DOWNLOAD, "SUCESS");
        return resource;
    }

    public void saveFile(MultipartFile file, DeviceModel device){
        try{
            Path directory = Paths.get(rootPath);
            if(!Files.exists(directory)) Files.createDirectories(directory);

            String systemName = UUID.randomUUID().toString() + "_" + file.getOriginalFilename();
            Path targetPath = directory.resolve(systemName);

            Files.copy(file.getInputStream(), targetPath);

            FilesModel fileModel = new FilesModel();
            fileModel.setOriginalName(file.getOriginalFilename());
            fileModel.setStorageReference(targetPath.toString());
            fileModel.setSize(file.getSize());
            fileModel.setContentType(file.getContentType());
            FilesModel savedFile = filesRepository.save(fileModel);

            registrarHistorico(savedFile, device, TransferType.UPLOAD, "SUCCESS");
        } catch (IOException e){
            throw new RuntimeException("Erro ao salvar o arquivo Localmente", e);
        }
    }
    private void registrarHistorico(FilesModel file, DeviceModel device, TransferType type, String status){
        TransferHistoryModel history = new TransferHistoryModel();
        history.setFiles(file);
        history.setDevice(device);
        history.setTransferType(type);
        history.setStatus(TransferStatus.valueOf(status));
        historyRepository.save(history);
    }
}