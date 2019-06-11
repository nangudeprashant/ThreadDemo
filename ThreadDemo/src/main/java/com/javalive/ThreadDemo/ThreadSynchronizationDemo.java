package com.javalive.ThreadDemo;

public class ThreadSynchronizationDemo {
	public static void main(String args[])
	 {
		 Second d=new Second();
		 Third ob1=new Third (d);
		 Third ob3=new Third (d);
		 //Fourth ob2=new  Fourth(d);
	     ob1.start();
	     //ob2.start();
	     ob3.start();
	 }
}
class Second
{
  public synchronized void print(int n)
  {
	  for(int i=1;i<=10;i++)
	  {
		  System.out.println(n*i);
	  try { Thread.sleep(500);
	  
	  }catch(Exception e){System.out.println(e);}
	    
	  }
	  System.out.println("=============================================");
  }
}
 class Third extends Thread
 {
	 Second d;
	 Third(Second d)
	 {
		this.d=d;
	 }
   public void run()
   {
	   d.print(5);
   }
 
 }
  
 class Fourth extends Thread
 {
	 Second d;
	 Fourth(Second d)
	 {
		this.d=d;
	 }
	 public void run()
	   {
		   d.print(10);
	   }
	 }
  