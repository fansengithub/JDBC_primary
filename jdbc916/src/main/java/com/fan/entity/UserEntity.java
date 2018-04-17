package com.fan.entity;

import java.io.Serializable;

/**
 * Created by fansen on 2017/9/17.
 */
public class UserEntity implements Serializable {
    private  String userName;
    private  String passWord;

//    生成构造函数
    public UserEntity() {
        super();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
