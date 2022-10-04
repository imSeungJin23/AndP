package com.example.and14_allview.listview;

import android.widget.ImageView;
import android.widget.TextView;

public class animalDTO {
    private String name,category;
    private int image;

    public animalDTO(String name, String category, int image) {
        this.name = name;
        this.category = category;
        this.image = image;
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

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
