package com.duba.service;

import com.duba.entity.CarDTO;
import com.duba.repository.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarRepo carRepo;

    public List<CarDTO> getAllCarDTO() {
        return carRepo.findAll();
    }
}
