package enigma.camp.application;

import enigma.camp.data.Person;

import java.util.List;

public class MutableApp {
    public static void main(String[] args) {

        Person person = new Person("Reza");

        person.addHobby("Coding");
        person.addHobby("Hiking");
        doSomethingWithHobbies(person.getHobbies());
        for (var hobby : person.getHobbies()) {
            System.out.println(hobby);
        }
    }

    public static void doSomethingWithHobbies(List<String> hobbies) {
        hobbies.add("Bukan Hobby");
    }
}
