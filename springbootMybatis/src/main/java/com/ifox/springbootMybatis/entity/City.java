package com.ifox.springbootMybatis.entity;


public class City {
    private Long id;
    private Long provienceId;
    private String cityName;
    private String des;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProvienceId() {
        return provienceId;
    }

    public void setProvienceId(Long provienceId) {
        this.provienceId = provienceId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
