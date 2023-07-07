package vladproduction.strategy.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DemoExample {
    public static void main(String[] args) {

        Person person1 = new Person("AAA","111",35);
        Person person2 = new Person("BBB","222",39);
        Person person3 = new Person("CCC","333",27);

        List<Person> persons = new ArrayList<>();
        persons.add(person1);
        persons.add(person2);
        persons.add(person3);

        System.out.println("unsorted:");
        printContent(persons);


        //step for sorting by age:
        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getAge()>o2.getAge()){
                    return 1;
                }
                if(o1.getAge()<o2.getAge()){
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("sorted by age:");
        printContent(persons);

        //step for sorting by name:

        Collections.sort(persons, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("sorted by name:");
        printContent(persons);
    }

    private static void printContent(List<Person> persons) {
        for (Person person: persons) {
            System.out.println(person.getName()+", "+person.getAge());
        }
    }

}
