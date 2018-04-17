package jdbc;

import java.sql.*;

/**
 * Created by fansen on 2017/9/16.
 */
public class JDBCTest {




    public static void main(String[] args) {
        String sql = "select * from tbl_user";
        Connection coon = null;
        Statement st = null;
        ResultSet rs = null;

        try{
//            注册mysql的jdbc驱动程序
            Class.forName("com.mysql.jdbc.Driver");
//            获取mysql的数据库连接
            coon = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db1","root","123456");

            //            发送数据库语句
            st = coon.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()){
//                获取数据库中，数据类型为int型的字段值
                System.out.print(rs.getInt("id")+"  ");
//                获取数据库中，数据类型为string类型的字段值
                System.out.print(rs.getString("name")+"  ");
                System.out.print(rs.getString("password")+"  ");
                System.out.print(rs.getString("email")+"  ");
                System.out.println();
            }
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            ///编写资源清理的逻辑
            try {
                    rs.close();
            }catch (Exception e2){
                e2.printStackTrace();
            }
            try {
                   st.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                coon.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }
}
