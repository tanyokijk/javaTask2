package com.aimiko.helloword.persistence.entity;

import java.util.ArrayList;
import java.util.List;

public class Country {

    private String name;

    private String continent;

    private int population;

    private int phoneCode;

    private String capital;

    private List<String> cities;

    public Country(String name, String continent, int population, int phoneCode, String capital, List<String> cities) {
        this.name = name;
        this.continent = continent;
        this.population = population;
        this.phoneCode = phoneCode;
        this.capital = capital;
        this.cities = cities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public List<String> getCities() {
        return cities;
    }

    public void setCities(List<String> cities) {
        this.cities = cities;
    }

    @Override
    public String toString() {
        return
                "Назва: " + this.name + ", " +
                "континент: " + this.continent + ", " +
                "населення: " + this.population + ", " +
                "телефоний код: " + this.phoneCode + ", " +
                "столиця: " + this.capital + ", " +
                "міста: " + String.join(", ", this.cities);
    }
}
