package com.matheus.filesB7.devices.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "device_b7")
public class DeviceModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id", nullable = false, unique = true)
    private UUID id;
    @Column(name = "device_name", nullable = false)
    private String deviceName;
    @Column(name = "mac_address", unique = true)
    private String macAddress;
    @Column(name = "last_acess")
    private LocalDateTime lastAcess;
}