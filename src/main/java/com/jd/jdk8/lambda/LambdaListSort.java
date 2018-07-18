package com.jd.jdk8.lambda;

import com.jd.utils.GsonUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author:kaichenr
 * @Date:2018/7/18 10:53
 **/
public class LambdaListSort {

    public static void main(String[] args) {
        LambdaListSort lambdaListSort = new LambdaListSort();
        lambdaListSort.sortList1();

    }

    public void sortList1() {
        List<Person> list1 = new ArrayList<Person>();
        List<Person> list2 = new ArrayList<Person>();

        Person p1 = new Person("bob", 28);
        Person p2 = new Person("tom", 19);
        Person p3 = new Person("lilei", 16);
        Person p4 = new Person("wolf", 21);
        Person p5 = new Person("wolf2", 21);

        list1.add(p1);
        list1.add(p2);
        list2.add(p3);
        list2.add(p4);
        list2.add(p5);
        list1.addAll(list2);

        list1.sort(
                (o1, o2) -> {
                    if (o1.getAge() == o2.getAge()) {
                        return 0;
                    }
                    if (o1.getAge() > o2.getAge()) {
                        return 1;
                    } else {
                        return -1;
                    }
                }
        );

        System.out.println(GsonUtil.GsonString(list1));
    }

    public void sortList2(){
        
    }
}
