package com.matheus.filesB7.files.controller;

import com.matheus.filesB7.files.model.FilesModel;
import com.matheus.filesB7.files.service.FileService;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/files")
public class FileController {

    private final FileService fileService;

    public FileController(FileService fileService) {
        this.fileService = fileService;
    }

    @PostMapping("/upload")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file) {
        if (file.isEmpty()) {
            return ResponseEntity.badRequest().body("Por favor, selecione um arquivo.");
        }

        fileService.saveFile(file, null);

        return ResponseEntity.ok("Arquivo '" + file.getOriginalFilename() + "' enviado com sucesso!");
    }

    @GetMapping("/all")
    public ResponseEntity<List<FilesModel>> listarArquivos() {
        List<FilesModel> arquivos = fileService.getAll();
        return ResponseEntity.ok(arquivos);
    }

    @GetMapping("/download/{id}")
    public ResponseEntity<Resource> downloadFile(@PathVariable UUID id) {
        Resource resource = fileService.downloadFile(id, null);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}