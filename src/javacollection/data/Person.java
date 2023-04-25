package javacollection.data;

import java.util.Collections;
import java.util.List;

//immutable list
public class Person {

    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public void addHobby(String hobby){
        hobbies.add(hobby);
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }
}
