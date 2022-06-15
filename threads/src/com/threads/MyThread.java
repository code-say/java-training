package com.threads;

//creating our thread using runnable Interface

public class MyThread implements Runnnable {

	public void run()
	{
		//task for thread...
		for(int i=1; i<10; i++)
		{
			System.out.println("value of i :"+i);
		try {
			Thread.sleep(1000);
			}catch(Exception e) {
				
			}
		}
	}
	public static void main(String[] args) {
		//create object of mythread class
		MyThread t1=new MyThread();
		//Thread thr=new Thread(t1);
		//object of AnotherThread
		//MyAnotherThread t2= new MyAnotherThread();
		//thr.start();
		//t2.start();
	}
}

