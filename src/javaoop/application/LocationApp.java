package javaoop.application;

import javaoop.data.City;
import javaoop.data.Location;

public class LocationApp {
    public static void main(String[] args) {

        //var location = new Location(); //ERROR
        var city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);

    }
}
