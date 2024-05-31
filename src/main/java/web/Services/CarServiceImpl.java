package web.Services;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {
    public List<Car> getCars(List<Car> carList, int quantity) {
        return carList.stream().limit(quantity).toList();
    }

    public List<Car> getFiveCars() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car(1, "Audi", "E-tron", "Metallic"));
        carList.add(new Car(2, "Mazda", "MX-5", "Dark Red"));
        carList.add(new Car(3, "Mitsubishi", "Pajero Sport", "Grey Asphalt"));
        carList.add(new Car(4, "Toyota", "Supra", "Dream Orange"));
        carList.add(new Car(5, "Ford", "Raptor", "Shelter Green"));
        return carList;
    }
}
