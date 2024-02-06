package org.vladproduction.processor;

import org.vladproduction.model.Customer;

import java.util.List;

public interface CustomerListProcessor {

    List<Customer> getCustomerList(String prefix);
}
