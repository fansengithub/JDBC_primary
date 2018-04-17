package com.fan.dao.impl;

import com.fan.dao.UserDao;
import com.fan.entity.User;

import java.sql.Connection;
import java.sql.PreparedStatement;

/**
 * Created by fansen on 2017/9/17.
 */
public class UserDaoImpl implements UserDao {

    /*
    * 保存用户信息
    * */
    public void save(Connection connection, User user) throws Exception {
//        用来至执行参数化查询
        PreparedStatement ps = connection.
                prepareCall("INSERT  into tbl_user_comment_test(name,password,email) VALUES (?,?,?)");
        ps.setString(1,user.getName());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getEmail());
        ps.execute();
    }

    /*
    *
    * 更新用户信息
    * */
    public void update(Connection connection, int id, User user) throws Exception {
        String  updateSql = "update tbl_user set name = ?, password = ?, email = ? where id = ?";
        PreparedStatement ps = connection.prepareCall(updateSql);

        ps.setString(1,user.getName());
        ps.setString(2,user.getPassword());
        ps.setString(3,user.getEmail());
        ps.setLong(4,id);
        ps.execute();
    }
    /*
    * 删除用户信息
    * */
    public void delete(Connection connection, User user) throws Exception {
        String deleteSql = "delete from tbl_user where id = ?";
        PreparedStatement ps = connection.prepareCall(deleteSql);
        ps.setLong(1,user.getId());
        ps.execute();
    }

}
