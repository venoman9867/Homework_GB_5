package com.GeekBrains;

public class Task1 extends Thread{
    private static final int size=1000000;
    private static final int h=size/2;
    public void arrayCreation(){
        int[] array=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=1;
        }
        long startTime = System.currentTimeMillis();
        for(int i=0;i<array.length;i++){
            array[i] = (int)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("поток 1 "+(System.currentTimeMillis()-startTime)+" ms");

    }
    public void arrayCreation2(){
        int[] array=new int[size];
        for (int i=0;i<array.length;i++){
            array[i]=1;
        }
       long startTime = System.currentTimeMillis();
        int[] left=new int[h];
        for(int j=0;j<left.length;j++){
            left[j] = (int)(left[j] * Math.sin(0.2f + j / 5) * Math.cos(0.2f + j / 5) * Math.cos(0.4f + j / 2));
        }
        int[] right=new int[h];
        for(int j1=0;j1<right.length;j1++){
            right[j1] = (int)(right[j1] * Math.sin(0.2f + j1 / 5) * Math.cos(0.2f + j1 / 5) * Math.cos(0.4f + j1 / 2));
        }
        System.arraycopy(array,0,left,0,h);
        System.arraycopy(array,h,right,0,h);
        int[] mergedArray=new int[size];
        System.arraycopy(left, 0, mergedArray, 0, h);
        System.arraycopy(right, 0, mergedArray, h, h);

        System.out.println("поток 2 "+(System.currentTimeMillis()-startTime)+" ms");
    }
}
