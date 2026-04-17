package com.matheus.filesB7.transferHistory.repository;

import com.matheus.filesB7.transferHistory.model.TransferHistoryModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TransferHistoryRepository extends JpaRepository<TransferHistoryModel, UUID> {
}
