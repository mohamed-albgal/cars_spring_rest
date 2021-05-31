package dev.malb.cardatabase.web;


import dev.malb.cardatabase.domain.Car;
import dev.malb.cardatabase.domain.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CarController {


    @Autowired
    private CarRepository carRepository;


    @RequestMapping("/cars")
    public Iterable<Car> getCars() {
        return carRepository.findAll();
    }


}
