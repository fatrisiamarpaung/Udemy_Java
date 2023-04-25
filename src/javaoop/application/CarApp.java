package javaoop.application;

import javaoop.data.Avanza;
import javaoop.data.Bus;
import javaoop.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();

        Car bus = new Bus();
        System.out.println(bus.getTire());
        bus.drive();
        bus.isMaintenance();
        bus.getBrand();
    }


}
