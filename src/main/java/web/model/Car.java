package web.model;


import java.util.ArrayList;
import java.util.List;

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


}
