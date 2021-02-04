package com.demo.jdk8.stream;

import com.demo.util.GsonUtil;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 11:34
 * @Description:
 **/
public class StreamOrder {

    private static int index = 1;

    public void lineOrder(List<Line> lines) {
        List<Line> list = lines.stream().map(e -> {
            e.setIndex(e.getStart().charAt(0));
            return e;
        }).sorted(Comparator.comparing(Line::getIndex)).collect(Collectors.toList());
        System.out.println(GsonUtil.GsonString(list));
    }

    public static List<Line> getLines(){
        Line line1 = new Line("C", "D");
        Line line2 = new Line("A", "B");
        Line line3 = new Line("D", "E");
        Line line4 = new Line("B", "C");
        List<Line> lines = new ArrayList<Line>();
        lines.add(line1);
        lines.add(line2);
        lines.add(line3);
        lines.add(line4);
        return lines;
    }

    public static void main(String[] args) {
        StreamOrder streamOrder = new StreamOrder();
        streamOrder.lineOrder(getLines());

    }
}
