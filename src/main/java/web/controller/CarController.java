package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import web.model.Car;

import java.util.Arrays;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model) {
        List<Car> cars = Arrays.asList(
                new Car("car1", "black", 2000),
                new Car("car1", "red", 2001),
                new Car("car2", "green", 2002),
                new Car("car3", "blue", 2003),
                new Car("car4", "white", 2004)
        );
        model.addAttribute("cars", cars);
        return "cars";
    }
}
