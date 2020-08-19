package step5.controller;

import step5.model.Car;
import step5.model.Cars;

import java.util.ArrayList;
import java.util.List;


public class CarRacing {
    private int numOfTries;
    private Cars cars;

    public CarRacing(String carNames, int numOfTries) {
        this.numOfTries = numOfTries;

        cars = returnCarsObj(carNames.split(","));
    }

    public Cars gameStart() {
        for (int i = 0; i < numOfTries; i++) {
            cars.carsMove();
        }
        return cars;
    }

    static Cars returnCarsObj(String[] inputs) {
        List<Car> cars = new ArrayList<>();

        for (int i = 0; i < inputs.length; i++) {
            cars.add(new Car(inputs[i]));
        }

        return Cars.makeCars(cars);
    }

}


