package com.matheus.filesB7.devices.repositoy;

import com.matheus.filesB7.devices.model.DeviceModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface DeviceRepository extends JpaRepository<DeviceModel, UUID> {
}
