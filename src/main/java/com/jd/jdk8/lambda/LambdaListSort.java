package com.jd.jdk8.lambda;

import com.jd.utils.GsonUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Author:kaichenr
 * @Date:2018/7/18 10:53
 **/
public class LambdaListSort {

    private Logger LOG = LoggerFactory.getLogger(LambdaListSort.class);

    public static void main(String[] args) {
        LambdaListSort lambdaListSort = new LambdaListSort();
//        lambdaListSort.sortList1();
        lambdaListSort.sortList2();
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

    public void sortList2() {
        List<Person> personList = new ArrayList<Person>();
        Person p1 = new Person("bob", 12);
        Person p2 = new Person("tom", 14);
        Person p3 = new Person("mark", 12);
        Person p4 = new Person("jean", 10);

        personList.add(p1);
        personList.add(p2);
        personList.add(p3);
        personList.add(p4);

        Collections.sort(personList, (o1, o2) -> {
            if (o1.getAge() == o2.getAge()) {
                return 0;
            }
            if (o1.getAge() > o2.getAge()) {
                return 1;
            } else {
                return -1;
            }
        });
        LOG.info("1111");

    }
}
