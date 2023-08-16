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


    @Override
    public List<String> getCars() {
        return carDao.getCars();
    }
}