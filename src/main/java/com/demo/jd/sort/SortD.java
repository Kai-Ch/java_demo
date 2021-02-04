package com.demo.jd.sort;

import com.demo.jd.Beans.Route;
import com.demo.util.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * description:
 * author:'kaichenr'
 * time:'2018/6/6'
 **/
public class SortD {
    public static void main(String[] args) {
        int index = 1;

        Route route = new Route("A", "F");
        route.setIndex(index);

        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        list.add("F");

        List<Route> routeList = new ArrayList<Route>();
        routeList.add(route);
        for (int i = 0; i < list.size() - 1; i++) {
            String start = list.get(i);
            for (int j = i + 1; j < list.size(); j++) {
//                if (i == 0 && j == list.size() - 1) {
//                    break;
//                }
                String end = list.get(j);
                Route route1 = new Route(start, end, index + 1);
                index++;
                routeList.add(route1);
            }

        }
        System.out.println(GsonUtil.GsonString(routeList));


    }
}
