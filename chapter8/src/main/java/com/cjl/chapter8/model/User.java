package com.cjl.chapter8.model;

public class User {
    private long id;
    private String name;
    private int age;
    private int city_id;

    public User() {

    }

    public User(String name, int age, int city_id) {
        this.name = name;
        this.age = age;
        this.city_id = city_id;
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

    public int getCityId() {
        return city_id;
    }

    public void setCityId(int city_id) {
        this.city_id = city_id;
    }
}
