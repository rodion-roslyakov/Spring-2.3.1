package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller
public class Car {

    private String model;
    private String series;
    private int year;

    public Car(String model, String series, int year) {
        this.model = model;
        this.series = series;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series='" + series + '\'' +
                ", year=" + year +
                '}';
    }

    public Car() {
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) int count,
                            ModelMap model) {

        Car car1 = new Car("Geely", "Coolray", 2023);
        Car car2 = new Car("Geely", "Monjaro", 2023);
        Car car3 = new Car("Geely", "Tugella", 2023);
        Car car4 = new Car("Porsche", "911turboS", 2023);
        Car car5 = new Car("BMW", "XM", 2023);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        List<String> messages = new ArrayList<>();
        if (count > 0) {
            for (int i = 0; i < count; i++) {
                if (count > 5) {
                    count = 5;
                }
                messages.add(cars.get(i).toString());
            }
        }
        model.addAttribute("messages", messages);
        return "cars";
    }
}
