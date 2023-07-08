package vladproduction.adapter.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleDemo {
    public static void main(String[] args) {
        Integer [] arrayOfInts = new Integer[]{42,43,44};
        List<Integer> integerList = Arrays.asList(arrayOfInts);

        System.out.println(arrayOfInts);
        System.out.println(integerList);
    }
    //[Ljava.lang.Integer;@1b28cdfa
    //[42, 43, 44]
}
