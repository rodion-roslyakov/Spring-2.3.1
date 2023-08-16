package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    private String model;
    private String series;
    private int year;

    private static int count;
    public static int getCount() {
        return count;
    }




    public CarController(String model, String series, int year) {

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

    public CarController() {
    }

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) int count,
                            ModelMap model) {

        this.count = count;
        model.addAttribute("messages",carService.getCars());
        return "cars";
    }
}
