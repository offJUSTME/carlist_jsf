package com.duba.mbean;

import com.duba.entity.CarDTO;
import com.duba.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.annotation.SessionScope;

import java.util.List;

@Controller("carController")
@SessionScope
public class CarController {
    @Autowired
    private CarService carService;

    public List<CarDTO> getAllCars() {
        return carService.getAllCarDTO();
    }
}