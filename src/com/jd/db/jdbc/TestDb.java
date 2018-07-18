package com.jd.db.jdbc;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class TestDb {

    @Test
    public void testConnet(){
        Connection conn = JdbcMysql.getConnection();
        System.out.println(conn);

        String sql = "INSERT INTO user(id,name) VALUES(?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,"100001");
            preparedStatement.setString(2,"bill");
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
