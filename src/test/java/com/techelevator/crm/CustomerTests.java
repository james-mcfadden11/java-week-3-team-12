package com.techelevator.crm;

import com.techelevator.hr.Employee;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {

    // normal case
    @Test
    public void getBalanceDue_returns_30_given_services() {
        Customer customer = new Customer("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming", 10.0);
        servicesRendered.put("Walking", 10.0);
        servicesRendered.put("Sitting", 10.0);
        double result = customer.getBalanceDue(servicesRendered);
        Assert.assertEquals(30.0, result, 0.02);
    }

    // empty map
    @Test
    public void getBalanceDue_returns_0_given_empty_map() {
        Customer customer = new Customer("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        double result = customer.getBalanceDue(servicesRendered);
        Assert.assertEquals(0.0, result, 0.02);
    }

    // null map
    @Test
    public void getBalanceDue_returns_0_given_null_map() {
        Customer customer = new Customer("Test", "Testerson");
        Map<String, Double> servicesRendered = null;
        double result = customer.getBalanceDue(servicesRendered);
        Assert.assertEquals(0.0, result, 0.02);
    }

    // null map
    @Test
    public void getBalanceDue_returns_0_given_null_entry() {
        Customer customer = new Customer("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put(null, 10.0);
        servicesRendered.put("Walking", 10.0);
        servicesRendered.put("Sitting", 10.0);
        double result = customer.getBalanceDue(servicesRendered);
        Assert.assertEquals(20.0, result, 0.02);
    }

}
