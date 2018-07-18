package com.jd.Beans;

/**
 * description:
 * author:'kaichenr'
 * time:'2018/6/8'
 **/
public class Route implements Comparable<Route>{

    private String from;

    private String to;

    private int index;

    public Route(String from, String to, int index) {
        this.from = from;
        this.to = to;
        this.index = index;
    }

    public Route(String from, String to) {
        this.from = from;
        this.to = to;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    @Override
    public int compareTo(Route o) {
        if(this.from.equals(o.from) && this.to.equals(o.to)){
            System.out.println("sssss");
            return 0;
        }else {
            return 1;
        }
    }
}
