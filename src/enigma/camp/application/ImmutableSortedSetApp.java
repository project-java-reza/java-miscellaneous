package enigma.camp.application;

import enigma.camp.data.Person;
import enigma.camp.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class ImmutableSortedSetApp {
    public static void main(String[] args) {
        SortedSet<Person> people = new TreeSet<Person>(new PersonComparator().reversed());
        people.add(new Person("Rizqi"));
        people.add(new Person("Reza"));
        people.add(new Person("Ardiansyah"));

        for (var person : people) {
            System.out.println(person.getName());
        }

        SortedSet<Person> sortedSet = Collections.unmodifiableSortedSet(people);
        //sortedSet.add(new Person("Reza")); // error
    }
}
