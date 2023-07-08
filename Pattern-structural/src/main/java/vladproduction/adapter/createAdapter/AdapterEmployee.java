package vladproduction.adapter.createAdapter;

import java.util.List;

public class AdapterEmployee {
    public static void main(String[] args) {

        EmployeeClient client = new EmployeeClient();
        List<Employee> employeeList = client.getEmployeeList();
        int i = 1;
        for (Employee employee: employeeList) {
            System.out.print(i++ +")"+employee+"\n");
        }
        System.out.println("----------");
        System.out.println(employeeList);

    }
}
