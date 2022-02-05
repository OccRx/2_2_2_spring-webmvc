package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String printCars(@RequestParam(value = "count", required = false) Integer count, Model model){
        List<Car> carList = new ArrayList<>();
        Car car  = new Car("Ford", 1,5);
        Car car1 = new Car("BMW", 2,4);
        Car car2 = new Car("Toyota", 3,3);
        Car car3 = new Car("Lexus", 4,2);
        Car car4 = new Car("Cadillac", 5,1);
        carList.add(car);
        carList.add(car1);
        carList.add(car2);
        carList.add(car3);
        carList.add(car4);
        model.addAttribute("cars", carService.getCar(carList, count));
        return "cars";
    }
}
