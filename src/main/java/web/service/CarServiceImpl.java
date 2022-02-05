package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    @Override
    public List<Car> getCar(List<Car> cars, Integer count) {
        if(count == null){
            return cars;
        }
        return cars.stream().limit(count).toList();
    }
}
