package javaoop;

public class PersonApp {
    public static void main(String[] args) {

        //Bikin object di java
        var person = new Person("Fatrisia", "Medan");

//        person.name = "Fatrisia Lorenta Marpaung";
//        person.address = "Medan";
       // person.country ="Italy"; akan error karna variabel bersifat final yg artinya tidak bisa diubah

        System.out.println(person.name);
        System.out.println(person.address);
        System.out.println(person.country);

        person.sayHello("Cana");

        Person person2 = new Person("Budi");

        Person person3;
        person3 = new Person();
        person3.name = "Joko";
        person3.sayHello("Budi");


    }
}
