package com.bigdata;

public class BigDataSingleton {

    private BigDataSingleton(){}
    
    private int numberOne =1;
    
    private static class SingletonHelper{
        private static final BigDataSingleton INSTANCE = new BigDataSingleton();
    }
    
    public static BigDataSingleton getInstance(){
        return SingletonHelper.INSTANCE;
    }
    
    
    pubic int getNumberOne()
    {
    	retune numberOne;
    }
    
     public void add(long value){
     	synchronized(this){
       	this.numberOne += value;
      }
     }
}