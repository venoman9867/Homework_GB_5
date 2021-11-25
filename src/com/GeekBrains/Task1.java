package com.GeekBrains;

public class Task1 extends Thread{
    private static final int size=1000000;
    public void arrayCreation(){
        int array[]=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=1;
        }
    }
    public void arrayCreation2(){
        int array[]=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=1;
        }
    }
}
