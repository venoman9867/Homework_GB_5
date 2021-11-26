package com.GeekBrains;

public class Main {

    public static void main(String[] args) {
        Thread thread1=new Thread();
        Task1 one=new Task1();
        one.arrayCreation();
        Thread thread2=new Thread();
        Task1 two=new Task1();
        two.arrayCreation2();
        thread1.start();
        thread2.start();

    }
}
