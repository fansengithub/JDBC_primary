package com.fan.JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by fansen on 2017/9/16.
 */


//数据库编程----事务处理
public class TransactionTest {
//    获取数据库连接
    public static Connection getConnection(){
        Connection conn = null;
        try {
//            注册mysql的jdbc驱动程序
            Class.forName("com.mysql.jdbc.Driver");
//            获取mysql的数据连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","123456");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
//    向用户表中插入数据
    public static  void  insertUserData(Connection conn) throws  Exception{
//        Connection conn = getConnection();

            String sql ="insert into tbl_user(id,name,password,email) values (10,'toms','666','999@qq.com')";
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("向用户中插入的记录数为："+count);


    }
//    向地址表中插入数据
    public  static  void  insertAddressData(Connection connection) throws  Exception{
//        Connection connection = getConnection();
        String sql = "insert into tbl_address(id,city,country,user_id)"+
                "values(1,'shanghai','china','10')";

            Statement st = connection.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("地址表中插入了记录数："+count);
            connection.close();


    }
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = getConnection();
            connection.setAutoCommit(false);   ///设置为不能自动提交

            insertUserData(connection);
//            System.out.println("****");
            insertAddressData(connection);

            connection.commit();
        } catch (Exception e) {
            System.out.println("-----捕获到sql异常-----");
            e.printStackTrace();

            try {
                connection.rollback();
                System.out.println("------事务回滚成功-----");
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }finally {    //资源清理的代码
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
