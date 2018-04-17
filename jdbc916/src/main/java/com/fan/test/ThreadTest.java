package com.fan.test;

/**
 * Created by fansen on 2017/9/21.
 */
public class ThreadTest {
    public static void main(String[] args) {
//       ThreadClass t =  new ThreadClass();
//       t.start();
//        System.out.println("hello,my ThreadTest!");

        ThreaClass1 t1 = new ThreaClass1();
        Thread  thread = new Thread(t1);
        thread.start();
        System.out.println("Thread.");
    }
}

class  ThreaClass1 implements  Runnable{
    public  void run(){   //此方法必须有，否则会编译报错。它是Runnable接口中的抽象方法。
        System.out.println("hello!");
    }
}
class  ThreadClass extends  Thread{

}

class  Out1{
    private  String name = "out.name";
    void  print(){
        final  String work = "out.local.work";
        //若不是final的则不能被animal使用
        int age = 10;
        class  Animal{
//            定义一个局部内部类，只能在print()方法中使用。
//            局部类中不能使用外部的非final的局部变量，全局的可以。
            public  void  cat(){
                System.out.println(work); //可以使用
//                age=20;  //不能使用
                System.out.println(name);   //可以使用
            }
        }
        Animal local = new Animal();
        local.cat();
    }
}
