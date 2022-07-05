package com.ironhack.edgeservice.controller.interfaces;

import com.ironhack.edgeservice.model.ProductDTO;

public interface EdgeController {
    ProductDTO getProduct(Long serialNumber);
}
