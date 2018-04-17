package com.fan.test;

/**
 * Created by fansen on 2017/9/19.
 */
public class StaticTest {
    public static void main(String[] args) {

    }

//    静态属性
    private static String string1 = "static_string";
    private String string2 = "string_2";

//    静态方法
    public  static  void  test2(){

//        System.out.println(string2);
//        System.out.println(test1());
    }
    public  void  test1(){
        System.out.println("");
        System.out.println(string1);
        System.out.println(string2);
        test2();
    }

}
