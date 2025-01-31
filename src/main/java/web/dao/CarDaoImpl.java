package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    private static final List<Car> carList = new ArrayList<>();

    static {
        carList.add(new Car("car1", "white", 2001));
        carList.add(new Car("car2", "black", 2002));
        carList.add(new Car("car3", "yellow", 2003));
        carList.add(new Car("car4", "blue", 2004));
        carList.add(new Car("car5", "red", 2005));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
