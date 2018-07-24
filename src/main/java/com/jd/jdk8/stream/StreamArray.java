package com.jd.jdk8.stream;

import com.jd.utils.GsonUtil;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.stream.Stream;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 11:11
 * @Description:
 **/
public class StreamArray {

    /**
     * array --> stream --(operation)--> object[]
     * Object[] obj1 = strs.toArray()
     */
    public void getArrayFromStream() {
        String[] weeks = {"monday", "tuesday", "wednesday", "", "thursday", "friday", "saturday", "sunday"};
        Object[] obj1 = Arrays.stream(weeks).map(String::toUpperCase).filter(StringUtils::isEmpty).toArray();
        System.out.println(GsonUtil.GsonString(obj1));
    }

    /**
     * toArray(String[]::new)
     */
    public void getArrayFromStream1(){
        String[] weeks = {"monday", "tuesday", "wednesday", "", "thursday", "friday", "saturday", "sunday"};
        String[] strArray1 = Stream.of(weeks).filter(StreamArray::checkFirstAlphabet).toArray(String[]::new);
        System.out.println(GsonUtil.GsonString(strArray1));
    }

    private static Boolean checkFirstAlphabet(String str){
        char c  = 's';
        if(StringUtils.isEmpty(str)){
            return false;
        }
        if(str.indexOf(c) != 0){
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        StreamArray streamArray = new StreamArray();
//        streamArray.getArrayFromStream();
        streamArray.getArrayFromStream1();
    }
}
