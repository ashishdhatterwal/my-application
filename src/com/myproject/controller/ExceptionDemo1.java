package com.myproject.controller;

import java.text.Format;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ExceptionDemo1 {
	
	private static Queue<Integer> queue = new ArrayBlockingQueue<Integer>(10);

	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread(
				new Runnable() {

					@Override
					public void run() {
						ExceptionDemo1 e1 = new ExceptionDemo1();
						try {
							e1.producer();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
		
		Thread t2 = new Thread(
				new Runnable() {

					@Override
					public void run() {
						ExceptionDemo1 e1 = new ExceptionDemo1();
						try {
							e1.consumer();
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
					
				});
		
		t1.start();
		t2.start();
		
		t1.join();
		t2.join();
		
		
	}
	
	void producer() throws InterruptedException {
		Integer i = 0;
		while(true) {
			if(queue.size()<10) {
				queue.add(i);
				System.out.println("Produced "+i);
				i++;
			}
		}
		
	}
	
	void consumer() throws InterruptedException {
		
		while(true) {
			
			if(queue.size()>0) {
				Thread.sleep(1000);
				Integer i = queue.remove();
				System.out.println("Consumed "+i );
			}
		}
		
	}

}
