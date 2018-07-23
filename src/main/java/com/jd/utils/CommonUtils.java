package com.jd.utils;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author:kaichenr
 * @Date:2018/7/23 10:25
 **/
public class CommonUtils {

    private final static String QUESTION_MARK = "?";
    private final static String AND = "&";

    public static void out(Object... objects) {
        Object[] objectArray = objects;
        List<Object> list = Arrays.asList(objectArray);
        String str = list.stream().filter(e -> e != null).map(x -> GsonUtil.GsonString(x)).collect(Collectors.joining(" "));
        if (StringUtils.isEmpty(str)) {
            return;
        } else {
            System.out.println(str);
        }
    }

    /**
     * @param objects ["aa=1","bb=2"]
     */
    public static String jointGetParams(String url, Object... objects) {
        Object[] objectArray = objects;
        List<Object> list = Arrays.asList(objects);
        String params = list.parallelStream().map(e -> e.toString().trim()).collect(Collectors.joining(AND));
        return url + QUESTION_MARK + params;
    }


    public static void main(String[] args) {
        CommonUtils.out("111", "222");
//        String url = CommonUtils.jointGetParams("https://www.baidu.com", "name=11", "id=22222");
//        System.out.println(url);

    }
}
