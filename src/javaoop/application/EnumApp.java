package javaoop.application;

import javaoop.data.Customer;
import javaoop.data.Level;

public class EnumApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setName("Eko");
        customer.setLevel(Level.PREMIUM);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel().getDescription() );

        //konversi dari enum ke string
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //konversi dari string ke enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        System.out.println("\n");

        System.out.println("Print Level");
        for (var value : Level.values()){
            System.out.println(value);
        }
    }
}
