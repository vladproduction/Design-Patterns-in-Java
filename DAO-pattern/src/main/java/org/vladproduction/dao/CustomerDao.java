package org.vladproduction.dao;

import org.vladproduction.datasource.ConnectionManager;
import org.vladproduction.model.Customer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDao {

    void setConnection(ConnectionManager connection);
    int insertCustomer(String name);
    ResultSet getCustomersByName(String customerName) throws SQLException;
    List<Customer> getAllCustomers();
}
