package com.duba.repository;

import com.duba.entity.CarDTO;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CarRepo extends Repository<CarDTO, String> {
    List<CarDTO> findAll();
}
