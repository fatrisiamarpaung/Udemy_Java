package javaoop.application;

import javaoop.data.Aplication2;
import static javaoop.data.Constant.*;
import javaoop.data.Country;
import javaoop.util.MathUtil;
//Static Keyword
public class StaticApp {
    public static void main(String[] args) {

        System.out.println(APPLICATION);
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Medan");

        System.out.println(city.getName());

        System.out.println(Aplication2.PROCESSORS);
    }
}
