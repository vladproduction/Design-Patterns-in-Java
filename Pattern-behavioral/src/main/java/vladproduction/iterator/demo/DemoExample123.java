package vladproduction.iterator.demo;

import java.util.*;

public class DemoExample123 {
    public static void main(String[] args) {

        //List<String> list = new ArrayList<>();
        Set<String> list = new HashSet<>();

        list.add("one");
        list.add("two");
        list.add("tree");


        Iterator<String> listIterator = list.iterator();

        //3-for: (that kind of loop doesn`t usefull for Set collection;
        //not able to use git(i)!!! )
//        for (int i = 0; i< list.size();i++){
//            String item = list.get(i); //here is the problem to iterate Set
//            System.out.println(item);
//        }

        //2-foreach (do not need Iterator instance 'listIterator'):
        //but foreach loop is works with Set--> as HashSet
        //it`s possible that Set isn`t based on get(i) method of an index
//        for (String item: list) {
//            System.out.println(item);
//        }

        //1-while:
        //while loop is working with Set as well, and also allowed us to remove objects where
        //remove method located
        while (listIterator.hasNext()){
            String item = listIterator.next();
            System.out.println(item);
            listIterator.remove();
        }
        System.out.println("Size = "+list.size());
    }
}
