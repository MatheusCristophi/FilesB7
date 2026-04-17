package com.matheus.filesB7.files.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "files_b7")
public class FilesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;
    @Column(name = "original_name", nullable = false, unique = false)
    private String originalName;
    @Column(name = "storage_reference", nullable = false)
    private String storageReference;
    @Column(name = "size")
    private Long size;
    @Column(name = "content_type")
    private String contentType;
    @CreationTimestamp
    @Column(name = "upload_at", updatable = false)
    private LocalDateTime uploadAt;
}
