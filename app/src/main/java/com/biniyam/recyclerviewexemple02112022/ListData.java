package com.biniyam.recyclerviewexemple02112022;

public class ListData {
    String descripiton;
    int imageId;

    public ListData(String descripiton, int imageId) {
        this.descripiton = descripiton;
        this.imageId = imageId;
    }

    public String getDescripiton() {
        return descripiton;
    }

    public int getImageId() {
        return imageId;
    }

    public void setDescripiton(String descripiton) {
        this.descripiton = descripiton;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
