package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImp implements CarService {

    public static final List<Car> carList = Arrays.asList(
            new Car("Mersedes", "Black", 600),
            new Car("Porshe", "Yellow", 911),
            new Car("Peugeot", "Yellow", 308),
            new Car("Lada", "Blue", 606),
            new Car("Toyota", "White", 1000)
    );
    @Override
    public List<Car> getCarsList(Integer count) {
        return count == null || count > carList.size() ? carList : carList.subList(0, count);
    }
}
