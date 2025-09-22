package enigma.camp.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Person {
    private String name;

    private List<String> hobbies;

    public Person(String name) {
        this.name = name;
        this.hobbies = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addHobby(String hobby) {
        hobbies.add(hobby); // mutable list
    }

    public List<String> getHobbies() {
        return Collections.unmodifiableList(hobbies);
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
