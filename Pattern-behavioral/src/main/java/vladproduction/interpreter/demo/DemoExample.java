package vladproduction.interpreter.demo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DemoExample {
    public static void main(String[] args) {
        String input = "Animal, Lions, Tigers, Elephant";

        Pattern p = Pattern.compile("(lion|Elephant|cat|dog|Tiger|Tigers)");
        Matcher m = p.matcher(input);
        while (m.find()){
            System.out.println("found: "+m.group());
//            found: Tiger
//            found: Elephant
        }
    }
}
