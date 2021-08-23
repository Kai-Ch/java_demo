package com.demo.some;

import com.demo.util.GsonUtil;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * author:'kaichenr'
 * time:'2018/5/24'
 **/
public class TestCase {

    @Test
    public void stringTest() {
        String str = "36.54202037005777";
        int a = str.codePointCount(str.indexOf(".") + 1, str.length());
        System.out.println(a);
        str = str.substring(0, str.indexOf(".") + 7);
        System.out.println(str);
    }

    @Test
    public void lengthTest() {
        String str = "12";
        System.out.println(str.length());
    }

    @Test
    public void orderTimeTest(){
        String str = "{\"id\":\"111\",\"time\":\"2018-06-28 15:19:19\"}";
        Order order = GsonUtil.GsonToBean(str, Order.class);
        System.out.println(GsonUtil.GsonString(order));
    }

    @Test
    public void dateTest() throws ParseException {
        String str = "Thu Jun 28 19:01:08 CST 2018";
        String str1 = "2018-06-28 16:58:10";
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date1 = new Date();

        Order order = new Order();
        date1.getTime();


    }

    @Test
    public void  getDateTest() {
        String str1 = "Tue Dec 05 22:08:16 CST 2017";

        try {
            if (str1 == null || str1.equals("")) {

            }
            //         Calendar now = Calendar.getInstance(TimeZone.getDefault());
            String DATE_FORMAT = "yyyyMMddHHmmss";
            //          java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat(DATE_FORMAT);
            SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
            //          sdf.setTimeZone(TimeZone.getDefault());
            Date d = sdf.parse(str1);
            //          java.text.DateFormat df = java.text.DateFormat.getDateTimeInstance();
            //          java.utils.Date  d= df.parse(dateStr);
            System.out.println(d);
        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    @Test
    public void timestampTest(){
        String str = "{\"id\":\"111\",\"time\":\"2018-06-28 15:19:19\"}";
        Order order = GsonUtil.GsonToBean(str, Order.class);
//        Timestamp timestamp = new Timestamp(order.getTime().getTime());
//        order.setTime(timestamp);
        System.out.println(order.getTime());
    }

    @Test
    public void testIndex(){
        String sysId = "01";
        String cataCode = "0102";
        System.out.println(cataCode.indexOf(sysId));

    }
}
