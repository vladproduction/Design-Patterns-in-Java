package org.vladproduction.processor;

import org.vladproduction.dao.CustomerDao;
import org.vladproduction.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerListProcessorImpl implements CustomerListProcessor {

    private CustomerDao customerDao;

    public CustomerListProcessorImpl(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void setCustomerDao(CustomerDao customerDao){
        this.customerDao = customerDao;

    }
    @Override
    public List<Customer> getCustomerList(String prefix) {
        final List<Customer> allCustomers = customerDao.getAllCustomers();
        final List<Customer> result = new ArrayList<>();
        for (Customer customer : allCustomers) {
            if(customer.getName().startsWith(prefix)){
                result.add(customer);
            }
        }
        return result;
    }
}
