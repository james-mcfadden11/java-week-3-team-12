package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetTests {
    private Pet sut;

    // test cases
    // ["Rabies", "Distemper", "Parvo"] returns Rabies, Distemper, Parvo
    // empty list
    // null item in list
    // null

    @Before
    public void setup() {
        sut = new Pet("", "");
    }

    // normal case
    @Test
    public void listVaccinations_returns_string_of_vaccinations() {
        // arrange
        // act
        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Rabies");
        vaccinations.add("Distemper");
        vaccinations.add("Parvo");
        sut.setVaccinations(vaccinations);
        String result = sut.listVaccinations();
        String expected = "Rabies, Distemper, Parvo";
        // assert
        Assert.assertEquals(expected, result);
    }

    // empty list
    @Test
    public void listVaccinations_returns_empty_string_given_empty_list() {
        // arrange
        // act
        List<String> vaccinations = new ArrayList<>();
        sut.setVaccinations(vaccinations);
        String result = sut.listVaccinations();
        String expected = "";
        // assert
        Assert.assertEquals(expected, result);
    }

    // one String is null
    @Test
    public void listVaccinations_returns_string_of_vaccinations_with_null_value() {
        // arrange
        // act
        List<String> vaccinations = new ArrayList<>();
        vaccinations.add("Rabies");
        vaccinations.add(null);
        vaccinations.add("Parvo");
        sut.setVaccinations(vaccinations);
        String result = sut.listVaccinations();
        String expected = "Rabies, Parvo";
        // assert
        Assert.assertEquals(expected, result);
    }

    // list is null
    @Test
    public void listVaccinations_returns_empty_string_given_null_list() {
        // arrange
        // act
        List<String> vaccinations = null;
        sut.setVaccinations(vaccinations);
        String result = sut.listVaccinations();
        String expected = "";
        // assert
        Assert.assertEquals(expected, result);
    }



}
