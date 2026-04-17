package com.matheus.filesB7.transferHistory.model;

import com.matheus.filesB7.devices.model.DeviceModel;
import com.matheus.filesB7.files.model.FilesModel;
import com.matheus.filesB7.transferHistory.enums.TransferStatus;
import com.matheus.filesB7.transferHistory.enums.TransferType;
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
@Table(name = "transfer_history_b7")
public class TransferHistoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "file_id", nullable = false)
    private FilesModel files;

    @ManyToOne
    @JoinColumn(name = "device_id", nullable = false)
    private DeviceModel device;

    @Enumerated(EnumType.STRING)
    @Column(name = "transfer_type", nullable = false)
    private TransferType transferType;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private TransferStatus status = TransferStatus.PENDING;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}