package com.fan.test;

import com.fan.util.ConnectionFactory;

import java.sql.Connection;

/**
 * Created by fansen on 2017/9/16.
 */
public class ConnectionFactoryTest {
    public static void main(String[] args)  throws  Exception{
//        获取数据库连接实例
        ConnectionFactory cf = ConnectionFactory.getInstance();
        System.out.println("******");
//        获取数据库连接
        Connection connection = cf.makeConnection();

        System.out.println(connection.getAutoCommit());

        System.out.println("测试成功！！");
    }
}
