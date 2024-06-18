package com.aimiko.helloword.persistence.entity;

public class City {

    private String name;

    private String region;

    private String country;

    private int population;

    private int index;

    private int phoneCode;

    public City(String name, String region, String country, int population, int index, int phoneCode) {
        this.name = name;
        this.region = region;
        this.country = country;
        this.population = population;
        this.index = index;
        this.phoneCode = phoneCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getPhoneCode() {
        return phoneCode;
    }

    public void setPhoneCode(int phoneCode) {
        this.phoneCode = phoneCode;
    }

    @Override
    public String toString() {
        return
                "Назва: " + this.name + ", " +
                "регіон: " + this.region + ", " +
                "країна: " + this.country + ", " +
                "населення: " + this.population + ", " +
                "поштовий індекс: " + this.index + ", " +
                "телефонний код: " +this.phoneCode;
    }
}
