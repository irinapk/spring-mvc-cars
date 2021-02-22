package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarsController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String carsTable (@RequestParam(value = "count", defaultValue = "5") int count, Model model) {

        List<Car> carsList = carService.getAllCars(count);
        model.addAttribute("carsList", carsList);
        return "cars";
    }
}

//        Car car1 = new Car ("Bentley", "England", 2010);
//        Car car2 = new Car ("Mercedes", "Germany", 2015);
//        Car car3 = new Car ("Toyota", "Japan", 2020);
//        Car car4 = new Car ("Hyundai", "Korea", 2007);
//        Car car5 = new Car ("Chevrolet", "United States", 2013);
//        Car[] cars = {car1, car2, car3, car4, car5};
//        List<Car> carsList = Arrays.stream(cars).limit(count).collect(Collectors.toList());