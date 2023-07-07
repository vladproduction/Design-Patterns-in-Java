package vladproduction.template.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateExample {

    private static void printContent(List<Person> list){
        for (Person person:list) {
            System.out.println(person.getName()+" "+person.getAge());
        }
    }
    public static void main(String[] args) {

        Person person1 = new Person("AAA","123",35);
        Person person2 = new Person("BBB","456",39);
        Person person3 = new Person("CCC","789",32);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        System.out.println("unsorted:");
        printContent(personList);

        System.out.println("sorted:");
        Collections.sort(personList);
        printContent(personList);

    }
}
