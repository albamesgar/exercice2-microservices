package com.ironhack.edgeservice.controller.impl;

import com.ironhack.edgeservice.client.InventoryClient;
import com.ironhack.edgeservice.client.PriceClient;
import com.ironhack.edgeservice.controller.dto.PriceDTO;
import com.ironhack.edgeservice.controller.interfaces.EdgeController;
import com.ironhack.edgeservice.model.ProductDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EdgeControllerImpl implements EdgeController {
    @Autowired
    private InventoryClient inventoryClient;
    @Autowired
    private PriceClient priceClient;

    @GetMapping("/products/{serialNumber}")
    @ResponseStatus(HttpStatus.OK)
    public ProductDTO getProduct(@PathVariable Long serialNumber) {

        int quantity = inventoryClient.getQuantity(serialNumber);
        PriceDTO priceDTO = priceClient.getPriceAndName(serialNumber);

        ProductDTO productDTO = new ProductDTO(serialNumber,quantity, priceDTO.getProductName(), priceDTO.getPrice());

        return productDTO;
    }
}
