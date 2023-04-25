package javaoop;
//Constructor
class Person {
    String name;
    String address;
    final String country = "Indonesia";

    //Buat Constructor
    Person(String name, String address){
        this.name = name; //solusi dari var shadowing
        this.address = address;
    }


    //Constructor overloading
    Person(String paramName){
       // name = paramName;
        //memanggil constructor yg lain
        this(paramName, null);
    }

    //Constructor tanpa parameter
    Person(){
        this(null);

    }

    //Buat method
    void  sayHello(String name){

        System.out.println("Hello " + name + ", My name is " + this.name);
    }

}
