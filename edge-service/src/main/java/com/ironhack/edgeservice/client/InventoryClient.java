package com.ironhack.edgeservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@FeignClient("inventory-service")
public interface InventoryClient {
    @GetMapping("/quantity/{serialNumber}")
    int getQuantity(@PathVariable Long serialNumber);
}
