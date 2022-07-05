package com.ironhack.edgeservice.client;

import com.ironhack.edgeservice.controller.dto.PriceDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("price-service")
public interface PriceClient {
    @GetMapping("/price/{serialNumber}")
    PriceDTO getPriceAndName(@PathVariable Long serialNumber);
}
