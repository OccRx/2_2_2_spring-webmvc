package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService{

    private List<Car> carList;
    { carList = new ArrayList<>();
        carList.add(new Car("BMW", 2, 4));
        carList.add(new Car("Toyota", 3, 3));
        carList.add(new Car("Lexus", 4, 2));
        carList.add(new Car("Cadillac", 5, 1));
        carList.add(new Car("Ford", 1,5));
    };

    @Override
    public List<Car> getCar(Integer count) {
        if(count == null){
            return carList;
        }
        return carList.stream().limit(count).toList();
    }
}
