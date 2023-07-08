package vladproduction.adapter.moreAdapters;

import java.util.ArrayList;
import java.util.List;

public class EmployeeClient {
    public List<Employee> getEmployeeList() {
        List<Employee> listEmp = new ArrayList<>();

        Employee empFromDB = new EmployeeDB("111","John","Week","johnWeek@gmail.com");
        listEmp.add(empFromDB);

        //will not work!
        //Employee empFromExel = new EmployeeExel("001", "MacClayne", "John", "johnMacClayne@gmail.com");

        // Adapter in action now:
        EmployeeExel empFromExel = new EmployeeExel("001", "MacClayne", "John", "johnMacClayne@gmail.com");

        listEmp.add(new EmployeeAdapterExel(empFromExel));

        EmployeeCSV empFromCSV = new EmployeeCSV("55, Holmes, Sherlock, holmes@sherlock.com");

        listEmp.add(new EmployeeAdapterCSV(empFromCSV));

        return listEmp;
    }
}
