package com.fan.test;

/**
 * Created by fansen on 2017/9/19.
 */
public class StaticTest2 extends Base {
    static {
        System.out.println("test static");
    }
    public  StaticTest2(){
        System.out.println("test constructor");
    }

    public static void main(String[] args) {
        new StaticTest2();
    }
}
class Base{
    static {
        System.out.println("base static");
    }
    public  Base(){
        System.out.println("base constructor");
    }
}

