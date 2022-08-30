package com.cjl.chapter6.model;

public class User {
    private Long id;
    private String name;
    private int age;
    private int city_id;
    private City city;

    public User() {

    }

    public User(String name, int age, int city_id) {
        this.name = name;
        this.age = age;
        this.city_id = city_id;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }
}
