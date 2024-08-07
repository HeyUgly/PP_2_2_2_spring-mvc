package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Services.CarService;
import web.Services.CarServiceImpl;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;


@Controller
public class CarController {

    final
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping(value = "/cars")
    public String printSomeCars(ModelMap model, @RequestParam(value = "count", defaultValue = "5") int count) {
        List<Car> cars = new ArrayList<>(carService.getCars(carService.getFiveCars(), count));
        model.addAttribute("showcars", cars);
        return "cars";
    }

}
