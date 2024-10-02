package com.napshop.controller;

import com.napshop.service.InventoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventory")
@Slf4j
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @GetMapping()
    public boolean isInStock(
            @RequestParam String skuCode,
            @RequestParam Integer quantity) {

        //        if (inStock) {
//            return ResponseEntity.ok("Inventory exists");
//        } else {
//            return ResponseEntity.status(HttpStatus.NOT_FOUND)
//                    .body("Inventory does not exist");
//        }
        return inventoryService.isInStock(skuCode, quantity);
    }
}
