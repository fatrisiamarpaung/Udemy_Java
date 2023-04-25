package javacollection;

import javacollection.data.Person;

import java.util.List;
//problem mutable list
public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Eko");

        person.addHobby("Game");
        person.addHobby("coding");

        doSomethingWithHobbies(person.getHobbies());

        for (var hobby : person.getHobbies()){
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies){
        hobbies.add("Bukan Hobby");
    }
}
