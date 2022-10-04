package com.example.and14_allview.gridview;

public class catDTO {

    private int img;
    private String name, category;

    public catDTO(String name, String category,int img) {
        this.img = img;
        this.name = name;
        this.category = category;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
