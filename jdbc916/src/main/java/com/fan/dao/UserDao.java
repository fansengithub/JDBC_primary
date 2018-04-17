package com.fan.dao;

import com.fan.entity.User;

import java.sql.Connection;
import java.util.Collection;

/**
 * Created by fansen on 2017/9/17.
 */
public interface UserDao {
    public  void  save(Connection connection, User user) throws Exception;
    public  void  update(Connection connection,int id,User user)throws  Exception;
    public  void  delete(Connection connection,User user) throws  Exception;
//    public  void  add(Connection connection,User user)throws Exception;
}
