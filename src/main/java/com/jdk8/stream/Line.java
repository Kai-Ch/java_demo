package com.jdk8.stream;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 11:34
 * @Description:
 **/
public class Line {
    private String start;
    private String end;
    private int index;

    public Line() {
        super();
    }

    public Line(String start, String end) {
        this.start = start;
        this.end = end;
    }

    public Line(String start, String end, int index) {
        this.start = start;
        this.end = end;
        this.index = index;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
