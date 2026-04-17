package com.matheus.filesB7.files.repository;

import com.matheus.filesB7.files.model.FilesModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface FilesRepository extends JpaRepository<FilesModel, UUID> {
}
