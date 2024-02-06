package org.vladproduction;

import org.vladproduction.dao.CustomerDao;
import org.vladproduction.dao.CustomerDaoImpl;
import org.vladproduction.datasource.ConnectionManager;
import org.vladproduction.datasource.ConnectionManagerMySql;
import org.vladproduction.model.Customer;
import org.vladproduction.processor.CustomerListProcessor;
import org.vladproduction.processor.CustomerListProcessorImpl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MainApp {
    public static void main(String[] args) throws SQLException {

        ConnectionManager connectionManager = new ConnectionManagerMySql();
        CustomerDao customerDao = new CustomerDaoImpl();
        customerDao.setConnection(connectionManager);

//        customerDao.insertCustomer("John");
//        customerDao.insertCustomer("Jack");
//        customerDao.insertCustomer("Peter");
//        customerDao.insertCustomer("Angeli");
//        customerDao.insertCustomer("Bob");
//        int nick = customerDao.insertCustomer("Nick");
//        System.out.println("nick = " + nick);


        List<Customer> allCustomers = customerDao.getAllCustomers();
        for (Customer customer : allCustomers) {
            System.out.println(customer);
        }


        ResultSet resultSet = customerDao.getCustomersByName("Peter");
        while (resultSet.next()) {
            System.out.printf(
                    "id: %d, name: %s; \n",
                    resultSet.getInt("id"),
                    resultSet.getString("name"));
        }

        System.out.println("--------------------------------------");
        CustomerListProcessor customerListProcessor = new CustomerListProcessorImpl(customerDao);
        List<Customer> jList = customerListProcessor.getCustomerList("J");
        for (Customer customer : jList) {
            System.out.println(customer);

        }



    }
}
