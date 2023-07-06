package vladproduction.memento.demo;

import java.io.*;

public class MementoDemo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        emp.setName("Jack Moody");
        emp.setAddress("Newcastle, GB-123");
        emp.setPhone("123-456");

        serialize(emp);

        Employee newEmp = deserialize();
        System.out.println(newEmp.getName());
    }

    private static Employee deserialize() {
        Employee emp = null;
        File file = new File("src/main/java/vladproduction/momento/demo/employee.txt");
        try {
            FileInputStream fileInp = new FileInputStream(file);
            ObjectInputStream in = new ObjectInputStream(fileInp);
            emp = (Employee) in.readObject();
            in.close();
            fileInp.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return emp;
    }


    private static void serialize(Employee emp) {
        File file = new File("src/main/java/vladproduction/momento/demo/employee.txt");
        try{
            FileOutputStream fileOut = new FileOutputStream(file);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(emp);
            out.close();
            fileOut.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
