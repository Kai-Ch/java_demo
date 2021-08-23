package com.demo.jd.db.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class JdbcMysql {

    private static Connection conn = null;

    private static String url = "jdbc:mysql://localhost:3306/db";

    private static String username = "root";

    private static String password = "root";

    public static Connection getConnection() {
        if (conn == null) {
            try {
                //加载驱动
                Class.forName("com.mysql.jdbc.Driver");
                //建立连接
                conn = DriverManager.getConnection(url, username, password);
                System.out.println("connect success");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }


}
