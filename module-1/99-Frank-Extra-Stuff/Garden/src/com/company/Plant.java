package com.company;

public class Plant {
    //variables
    private int height;
    private String type;
    private boolean isBlooms;




    //construtors
    public Plant(int height,String type,boolean isBlooms){
        this.height = height;
        this.type = type;
        this.isBlooms = isBlooms;
    }
    // getters&setters

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isBlooms() {
        return isBlooms;
    }

    public void setBlooms(boolean blooms) {
        isBlooms = blooms;
    }
}
