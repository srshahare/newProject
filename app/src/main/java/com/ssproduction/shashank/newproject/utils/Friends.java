package com.ssproduction.shashank.newproject.utils;

public class Friends {

    private String date;
    private String id;
    private String name;
    private String image;
    private String status;

    public Friends(){}

    public Friends(String date, String id, String name, String image, String status) {
        this.date = date;
        this.id = id;
        this.name = name;
        this.image = image;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
