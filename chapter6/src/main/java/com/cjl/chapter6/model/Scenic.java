package com.cjl.chapter6.model;

public class Scenic {

    private Integer scenicId;

    private Integer cityId;

    private String scenicName;

    private Integer price;

    public Scenic() {

    }

    public Scenic(Integer cityId, String scenicName, Integer price) {
        this.cityId = cityId;
        this.scenicName = scenicName;
        this.price = price;
    }

    public Integer getScenicId() {
        return scenicId;
    }

    public void setScenicId(Integer scenicId) {
        this.scenicId = scenicId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getScenicName() {
        return scenicName;
    }

    public void setScenicName(String scenicName) {
        this.scenicName = scenicName;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}