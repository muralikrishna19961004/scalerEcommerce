package com.example.sampleecommerce.model;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Category {
    private Integer id;
    private String title;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
