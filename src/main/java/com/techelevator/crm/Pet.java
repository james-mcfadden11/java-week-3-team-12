package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinations;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
        this.vaccinations = new ArrayList<>();
    }

    public String listVaccinations() {
        String vaccinationList = "";
        if (vaccinations == null || vaccinations.size() == 0) {
            return "";
        }

        for (int i = 0; i < vaccinations.size() - 1; i++) {
            if (vaccinations.get(i) == null) {
                continue;
            }
            vaccinationList += vaccinations.get(i);
            vaccinationList += ", ";
        }
        vaccinationList += vaccinations.get(vaccinations.size() - 1);

        return vaccinationList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List<String> vaccinations) {
        this.vaccinations = vaccinations;
    }
}
