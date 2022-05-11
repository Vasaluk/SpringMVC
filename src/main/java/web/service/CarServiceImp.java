package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Override
    public List<Car> getAllCars(int count) {
        List<Car> cars = new ArrayList<>();

        count = count <= 0 ? 0 : (count = count >= 5 ? 5 : count);

        for (int i = 0; i < count; i++) {
            cars.add(new Car("toyota" + (i + 1), "a11" + (i + 1) + "aa", i + 1));
        }
        return cars;
    }
}
