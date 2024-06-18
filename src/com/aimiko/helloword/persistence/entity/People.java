package com.aimiko.helloword.persistence.entity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class People {

    private String name;

    private Date birthday;

    private String phone;

    private String city;

    private String country;

    private  String address;

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd.MM.yyyy");

    public People(String name, String birthday, String phone, String city, String country, String address) {
        this.name = name;
        try {
            this.birthday = DATE_FORMAT.parse(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
            this.birthday = new Date();
        }
        this.phone = phone;
        this.city = city;
        this.country = country;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "ПІБ: " + name + ", Дата народження: " + DATE_FORMAT.format(birthday) + ", Телефон: " + phone + ", Місто: " + city + ", Країна: " + country + ", Адреса: " + address;
    }
}
