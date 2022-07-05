package com.ironhack.inventoryservice.controller.impl;

import com.ironhack.inventoryservice.controller.interfaces.InventoryController;
import com.ironhack.inventoryservice.model.Inventory;
import com.ironhack.inventoryservice.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class InventoryControllerImpl implements InventoryController {
    @Autowired
    private InventoryRepository inventoryRepository;

    @GetMapping("/quantity/{serialNumber}")
    @ResponseStatus(HttpStatus.OK)
    public int getQuantity(@PathVariable Long serialNumber) {
        Inventory inventory = inventoryRepository.findById(serialNumber).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND,"Inventory not found"));
        return inventory.getQuantity();
    }
}
