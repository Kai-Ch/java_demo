package com.demo.jd.superior.datastructure;

/**
 * @Author:kaichenr
 * @Date:2018/7/24 17:17
 * @Description:
 **/
public enum Weeks {
    MonDay("MonDay", "星期一"), TuesDay("TuesDay", "星期二"), WednesDay("WednesDay", "星期三"), ThursDay("ThursDay", "星期四"), FriDay("FriDay", "星期五"), SaturDay("SaturDay", "星期六"), SunDay("SunDay", "星期天");

    private final String key;
    private final String value;

    private Weeks(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public static Weeks getWeeks(String key){
        if(null == key){
            return null;
        }
        for(Weeks w : Weeks.values()){
            if(w.getKey().equals(key)){
                return w;
            }
        }
        return null;
    }

    public static String getWeekChines(String key){
        if(null == key){
            return null;
        }
        for(Weeks w : Weeks.values()){
            if(w.getKey().equals(key)){
                return w.getValue();
            }
        }
        return null;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
