package com.napshop.service;

public interface InventoryService {
    boolean isInStock(String skuCode, Integer quantity);
}
