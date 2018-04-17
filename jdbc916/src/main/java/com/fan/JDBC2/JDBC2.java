package com.fan.JDBC2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by fansen on 2017/9/16.
 */
public class JDBC2 {

    //    编写获取数据库连接方法
    public  static Connection getConnection(){
        Connection conn = null;
        try{
            //            注册mysql的jdbc驱动程序
            Class.forName("com.mysql.jdbc.Driver");
//            获取mysql的数据库连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","123456");

        }catch (Exception e){

        }
        return  conn;
    }
//    向数据库中插入数据的方法
    public  static void  insert(){
        Connection conn = getConnection();  //获取数据库连接
        String sql = "insert into tbl_user(name,password,email)"+
                "values('kitty','456123','333@qq.com')";
        try {
            Statement st = conn.createStatement();
            int  count = st.executeUpdate(sql);  //创建statment对象，并执行update语句
            System.out.println("向数据库表中插入了"+count+"条记录");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
//    从数据库中更新一条数据
    public  static  void  update(){
        Connection conn = getConnection();   ///获取数据库的连接
        String sql = "update tbl_user set email='666@qq.com' where name = 'kitty'";
        try {
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("向数据库中更新一条数据！");
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
//    从数据库中删除一条记录
    public  static  void  delete(){
        Connection conn = getConnection();
        String sql = "delete from tbl_user where name = 'kitty'";
        try {
            Statement st = conn.createStatement();
            int count = st.executeUpdate(sql);
            System.out.println("数据库中受影响的记录数为"+count);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
//            insert();
//    update();
    delete();
    }
}
