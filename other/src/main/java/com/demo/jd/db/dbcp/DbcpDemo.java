package com.demo.jd.db.dbcp;

import com.demo.util.Constant;
import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class DbcpDemo {

    private static Connection conn = null;

    private static BasicDataSource basicDataSource = null;

    public static Connection getConnection() {
        basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName(Constant.MYSQL_DRIVER_CLASS_NAME);
        basicDataSource.setUrl(Constant.MYSQL_DB_URL);
        basicDataSource.setUsername(Constant.MYSQL_USERNAME);
        basicDataSource.setPassword(Constant.MYSQL_PASSWORD);

        try {
            conn = basicDataSource.getConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

}
