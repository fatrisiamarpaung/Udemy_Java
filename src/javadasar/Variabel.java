package javadasar;

public class Variabel {
    public static void main(String[] args) {
        String name;
        name = "Fatrisia Lorenta Marpaung";
        int age = 20;
        final String address = "Indonesia";

        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

//        address ="Medan"; //Error

        name = "Andi";
        System.out.println(name);

        //Kata kunci var harus langsung diinisiasi
//        var name2; //akan error karna ga langsung diinisiasi
//        name2 = "Fatrisia M";

        var age2 = 20;
        var address2 = "Indonesia";

       // System.out.println(name2);
        System.out.println(age2);
        System.out.println(address2);

    }
}
