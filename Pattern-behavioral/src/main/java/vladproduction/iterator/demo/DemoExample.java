package vladproduction.iterator.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DemoExample {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("one");
        list.add("two");
        list.add("tree");

        Iterator<String> listIterator = list.iterator();
        while (listIterator.hasNext()){
            String item = listIterator.next();
            System.out.println(item);
            listIterator.remove();
        }
        System.out.println("Size = "+list.size());
    }
}
