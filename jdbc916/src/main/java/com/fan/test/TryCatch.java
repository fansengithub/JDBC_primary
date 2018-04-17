package com.fan.test;

/**
 * Created by fansen on 2017/9/19.
 */
public class TryCatch {
    public static void main(String[] args) {
        System.out.println( new TryCatch().test());
    }
    public   int test(){
        int x = 1;
        try {
            System.out.println("try");
            x = 2;
            return  x++;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
            x = 6;

            return  --x;
        }
//        return  x;
    }
}
