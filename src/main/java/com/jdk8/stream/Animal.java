package com.jdk8.stream;

import java.awt.*;

/**
 * @Author:kaichenr
 * @Date:2018/7/20 17:24
 **/
public class Animal {

    private String name;

    private Color coatColor;

    private int value;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color  getCoatColor() {
        return coatColor;
    }

    public void setCoatColor(Color coatColor) {
        this.coatColor = coatColor;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Animal(String name, Color coatColor, int value) {
        this.name = name;
        this.coatColor = coatColor;
        this.value = value;
    }

    public Animal() {
        super();
    }
}
