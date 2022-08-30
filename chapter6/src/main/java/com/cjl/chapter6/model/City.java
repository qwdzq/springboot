package com.cjl.chapter6.model;

import java.util.List;

public class City {

    private Integer cityId;

    private String cityName;

    private String country;

    private List<Scenic> scenics;

    public City() {

    }

    public City(String cityName, String country) {
        this.cityName = cityName;
        this.country = country;
    }


    public List<Scenic> getScenics(){
        return scenics;
    }

    public void setScenics(List<Scenic> scenics)
    {
        this.scenics = scenics;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}