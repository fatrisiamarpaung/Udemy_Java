package javaoop.application;

import javaoop.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        //this is an anonymous class
        HelloWorld englsih = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello" + name);
            }
        };

        HelloWorld indonesia = new HelloWorld(){
            @Override
            public void sayHello() {
                System.out.println("Halo");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Halo" + name);
            }
        };

        englsih.sayHello();
        englsih.sayHello(" Eko");

        indonesia.sayHello();
        indonesia.sayHello(" Budi");

    }
}
