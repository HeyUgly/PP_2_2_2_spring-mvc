package web.Services;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> getCars(List<Car> carList, int quantity);
    List<Car> getFiveCars();
}
