package com.Interview.base.collection;

import java.io.Serializable;

public class MapSortDemoBean implements Serializable {

    private int id;

    private String name;

    private int sala;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public MapSortDemoBean() {
    }

    public MapSortDemoBean(int id, String name, int sala) {
        this.id = id;
        this.name = name;
        this.sala = sala;
    }
}
