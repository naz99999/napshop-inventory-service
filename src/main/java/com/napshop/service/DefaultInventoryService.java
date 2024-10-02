package com.napshop.service;

import com.napshop.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class DefaultInventoryService implements InventoryService {
    private final InventoryRepository inventoryRepository;

    public DefaultInventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @Override
    public boolean isInStock(String skuCode, Integer quantity) {
         return inventoryRepository.existsBySkuCodeAndQuantityGreaterThanEqual(skuCode, quantity);
    }
}
