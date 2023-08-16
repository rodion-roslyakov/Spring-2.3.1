package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {


    @Autowired
    private CarDao carDao;

    List<Car> allCars() {

        List<Car> cars = new ArrayList<>();
        Car car1 = new Car("Geely", "Coolray", 2023);
        Car car2 = new Car("Geely", "Monjaro", 2023);
        Car car3 = new Car("Geely", "Tugella", 2023);
        Car car4 = new Car("Porsche", "911turboS", 2023);
        Car car5 = new Car("BMW", "XM", 2023);

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);
        return cars;
    }


    @Override
    public List<String> getCars() {
        return carDao.getCars();
    }
}