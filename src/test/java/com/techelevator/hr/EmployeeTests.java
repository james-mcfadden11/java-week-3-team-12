package com.techelevator.hr;

import com.techelevator.crm.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }

    @Test
    public void getBalanceDue_returns_25_given_services() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming", 10.0);
        servicesRendered.put("Walking", 10.0);
        servicesRendered.put("Sitting", 10.0);
        double result = employee.getBalanceDue(servicesRendered);
        Assert.assertEquals(25.0, result, 0.02);
    }

    // empty map
    @Test
    public void getBalanceDue_returns_0_given_empty_map() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        double result = employee.getBalanceDue(servicesRendered);
        Assert.assertEquals(0.0, result, 0.02);
    }

    // null map
    @Test
    public void getBalanceDue_returns_0_given_null_map() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> servicesRendered = null;
        double result = employee.getBalanceDue(servicesRendered);
        Assert.assertEquals(0.0, result, 0.02);
    }

    // null map
    @Test
    public void getBalanceDue_returns_0_given_null_entry() {
        Employee employee = new Employee("Test", "Testerson");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming", 10.0);
        servicesRendered.put(null, 10.0);
        servicesRendered.put("Sitting", 10.0);
        double result = employee.getBalanceDue(servicesRendered);
        Assert.assertEquals(20.0, result, 0.02);
    }

}
