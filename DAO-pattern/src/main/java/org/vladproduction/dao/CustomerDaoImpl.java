package org.vladproduction.dao;

import org.vladproduction.datasource.ConnectionManager;
import org.vladproduction.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private ConnectionManager connection;

    @Override
    public void setConnection(ConnectionManager connection) {
        this.connection = connection;
    }

    @Override
    public int insertCustomer(String name) {
        try (Connection c = connection.getConnection();
             PreparedStatement ps = c.prepareStatement("insert into customer_table(name) values (?)")) {
            ps.setString(1, name);
            return ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ResultSet getCustomersByName(String customerName) throws SQLException {
        Connection c = connection.getConnection();
        PreparedStatement ps = c.prepareStatement("select * from customer_table where name=?");
        ps.setString(1, customerName);
        ResultSet resultSet = ps.executeQuery();
        return resultSet;

    }

    @Override
    public List<Customer> getAllCustomers() {
        try (Connection c = connection.getConnection();
             PreparedStatement ps = c.prepareStatement("SELECT * FROM customer_table");
             ResultSet rs = ps.executeQuery()) {

            List<Customer> allCustomers = new ArrayList<>();
            while (rs.next()) {
                Customer customer = new Customer(rs.getInt("id"), rs.getString("name"));
                allCustomers.add(customer);
            }
            return allCustomers;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
