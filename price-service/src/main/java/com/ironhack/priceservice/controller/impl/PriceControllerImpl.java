package com.ironhack.priceservice.controller.impl;

import com.ironhack.priceservice.controller.dto.PriceDTO;
import com.ironhack.priceservice.controller.interfaces.PriceController;
import com.ironhack.priceservice.model.Price;
import com.ironhack.priceservice.repository.PriceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class PriceControllerImpl implements PriceController {
    @Autowired
    private PriceRepository priceRepository;

    @GetMapping("/price/{serialNumber}")
    @ResponseStatus(HttpStatus.OK)
    public PriceDTO getPriceAndName(@PathVariable Long serialNumber) {
        Price price = priceRepository.findById(serialNumber).orElseThrow(()->
                new ResponseStatusException(HttpStatus.NOT_FOUND));
        PriceDTO priceDTO = new PriceDTO(price.getProductName(),price.getPrice());
        return priceDTO;
    }
}
