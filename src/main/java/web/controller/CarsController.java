package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import java.util.List;


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
