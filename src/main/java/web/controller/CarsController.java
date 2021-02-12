package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String carsTable (@RequestParam(value = "count", defaultValue = "0") int count, Model model) {

        Car car1 = new Car ("Bentley", "England", 2010);
        Car car2 = new Car ("Mercedes", "Germany", 2015);
        Car car3 = new Car ("Toyota", "Japan", 2020);
        Car car4 = new Car ("Hyundai", "Korea", 2007);
        Car car5 = new Car ("Chevrolet", "United States", 2013);
        Car[] cars = {car1, car2, car3, car4, car5};

        List<Car> carsList = new ArrayList<>();
        if (count > 0 && count < 5) {
            for (int i = 0; i < count; i++) {
                carsList.add(cars[i]);
            }
        }
        else {
            for (int i = 0; i < 5; i++) {
                carsList.add(cars[i]);
            }
        }

        model.addAttribute("carsList", carsList);
        return "cars";
    }

}
