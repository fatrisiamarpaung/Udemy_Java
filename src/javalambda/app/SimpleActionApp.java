package javalambda.app;

import javalambda.SimpleAction;

public class SimpleActionApp {
    public static void main(String[] args) {
//
//        //Menggunakan anonymous class sederhana
//        SimpleAction simpleAction1 = new SimpleAction() {
//            @Override
//            public String action(String name) {
//                return "Eko";
//            }
//        };
//
//        //Menggunakan lambda
//        SimpleAction simpleAction2 = (String name) -> {
//          return "Eta";
//        };
//
//        System.out.println(simpleAction1.action("Eko"));
//        System.out.println(simpleAction2.action("Eta"));

        //Cara membuat Lambda
        //1. Kode dengan Parameter
        //pake tipe data
        SimpleAction simpleAction1 = (String value) -> {
            return "Hello" + value;
        };

        //tanpa tipe data
        SimpleAction simpleAction2 = (name) -> {
            return "Hello" + name;
        };

        //2. Lambda Tanpa Blok
        SimpleAction simpleAction3 = (String value) -> "Hello" + value;

        SimpleAction simpleAction4 = (value) -> "Hello" + value;

        SimpleAction simpleAction5 = value -> "Hello" + value;
    }
}
