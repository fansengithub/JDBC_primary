package com.fan.test;

/**
 * Created by fansen on 2017/9/21.
 */
public class Integer {
    public static void main(String[] args) {
        int i=10;
        java.lang.Integer j = new java.lang.Integer(i);
        java.lang.Integer b = i;
        System.out.println(b);
        System.out.println(b == i);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }
}
