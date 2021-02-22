package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    Car car1 = new Car ("Bentley", "England", 2010);
    Car car2 = new Car ("Mercedes", "Germany", 2015);
    Car car3 = new Car ("Toyota", "Japan", 2020);
    Car car4 = new Car ("Hyundai", "Korea", 2007);
    Car car5 = new Car ("Chevrolet", "United States", 2013);
    Car[] cars = {car1, car2, car3, car4, car5};

    @Override
    public List<Car> getAllCars (int count) {
        List<Car> carsList = Arrays.stream(cars).limit(count).collect(Collectors.toList());
        return carsList;
    }
}
