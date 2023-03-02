package co.develhope.firstapi5.controllers;

import co.develhope.firstapi5.DTO.CarDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cars")
class CarController{

    @GetMapping
    public CarDTO getCar() {
        CarDTO car = new CarDTO();
        car.setId("556-112-789");
        car.setModelName("Lamborghini");
        car.setPrice(346249.00);
        return car;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createCar(@Valid @RequestBody CarDTO car) {
        System.out.println("Success car: " + car);
    }



}