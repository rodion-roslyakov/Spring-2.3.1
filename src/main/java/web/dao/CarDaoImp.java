package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.controller.CarController;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDaoImp implements CarDao {
    @Autowired
    CarDao carDao;

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
        List<Car> cars = allCars();
        int count = CarController.getCount();
        List<String> messages = new ArrayList<>();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (count > 5) {
                    count = 5;
                }
                messages.add(cars.get(i).toString());
            }
        }
        return messages;
    }
}
