package com.fan.entity;

/**
 * Created by fansen on 2017/9/17.
 */
//定义一个抽象类,所有实体类的父类
public abstract class IdEntity {

//    封装了非业务的主键信息
    protected  Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
