package com.bigdata;
 
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
 
public class  BigDataMultiTreadApplication
{
    public static void main(String[] args) 
    {
        ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(5);
         
        for (int i = 1; i <= 5; i++) 
        {
            TestTask testtask = new TestTask("TestTask " + i);
            System.out.println("Created : " + tesettask.getName());
 
            executor.execute(testtask);
        }
        executor.shutdown();
    }
}