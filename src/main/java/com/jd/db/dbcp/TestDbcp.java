package com.jd.db.dbcp;

import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * author:'kaichenr'
 * time:'2018/5/4'
 **/
public class TestDbcp {

    @Test
    public void testBool(){
        Connection conn = DbcpDemo.getConnection();
        String sql = "insert into USER(id,name) values(?,?)";
        try {
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setString(1,"100002");
            preparedStatement.setString(2,"张三");
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
