package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarsController {

    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam("count") int count, ModelMap model) {
        List<Car> car = new ArrayList<>();
        car.add(new Car("toyota1", "a111aa", 1));
        car.add(new Car("toyota2", "a112aa", 2));
        car.add(new Car("toyota3", "a113aa", 3));
        car.add(new Car("toyota4", "a114aa", 4));
        car.add(new Car("toyota5", "a115aa", 5));

        CarService carService = new CarServiceImp();

        if ((count < 5) && (count > 0)) {
            model.addAttribute("cars", carService.getAllCars(car, count));
        }
        if (count >= 5) {
            model.addAttribute("cars", car);
        }

        return "cars";
    }
}