package com.ironhack.priceservice.repository;

import com.ironhack.priceservice.controller.dto.PriceDTO;
import com.ironhack.priceservice.model.Price;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PriceRepository extends JpaRepository<Price,Long> {

}
