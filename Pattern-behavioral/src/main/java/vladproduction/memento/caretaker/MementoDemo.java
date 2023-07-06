package vladproduction.memento.caretaker;

import java.io.*;

public class MementoDemo {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Employee emp = new Employee();
        emp.setName("John Week");
        emp.setAddress("London, GB-100");
        emp.setPhone("111-111");

        System.out.println("Employee before save: "+emp);
        caretaker.save(emp);

        emp.setPhone("222-222");
        caretaker.save(emp);
        System.out.println("Employee after change phone: "+emp);

        emp.setPhone("333-333"); //   <-- did not evoke save phone here

        caretaker.revert(emp);
        System.out.println("Revert to the last saved point: "+emp);

        caretaker.revert(emp);
        System.out.println("Revert to original point: "+emp);

    }

}
