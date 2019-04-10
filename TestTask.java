package com.bigdata;
 
import java.util.concurrent.TimeUnit;
 
public class TestTask implements Runnable {
    private String name;
 
    public TestTask(String name) {
        this.name = name;
    }
 
    public String getName() {
        return name;
    }
 
    public void run() {
        try {
            Long duration = (long) (Math.random() * 10);
	    			BigDataSingleton intanceBD = BigDataSingleton.getInstance();
            System.out.println("Executing : " + name + intanceBD.hashcode());
            System.out.println("BigDataSingleton add value : 10 " );
            intanceBD.add(10);
            System.out.println("BigDataSingleton CurrentNumberOne value : " + intanceBD.getNumberOne() );
 
            TimeUnit.SECONDS.sleep(duration);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}