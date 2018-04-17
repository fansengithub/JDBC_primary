package com.fan.test;

import com.fan.dao.UserDao;
import com.fan.dao.impl.UserDaoImpl;
import com.fan.entity.User;
import com.fan.util.ConnectionFactory;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Collection;

/**
 * Created by fansen on 2017/9/17.
 */
public class UserDaoTest {
    public static void main(String[] args) {
        Connection conn= null;
        try {
            conn = ConnectionFactory.getInstance().makeConnection();
            conn.setAutoCommit(false);


            UserDao userDao = new UserDaoImpl();
            User tom = new User();
            tom.setName("ketty");
            tom.setPassword("666");
            tom.setEmail("8888888");
            tom.getId();

//            保存用户信息
            userDao.save(conn,tom);

//            userDao.delete(conn,tom);
//            userDao.update(conn,2,tom);
            System.out.println("删除用户信息 ");

            conn.commit();
        } catch (Exception e) {
            try {
                System.out.println("事务回滚操作");
                conn.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace();
            }
        }
    }
}
