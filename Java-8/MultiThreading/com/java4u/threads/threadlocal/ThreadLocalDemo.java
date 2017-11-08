package com.java4u.threads.threadlocal;

import java.text.SimpleDateFormat;
import java.util.Random;

public class ThreadLocalDemo implements Runnable{

	private static final ThreadLocal<SimpleDateFormat> format = new ThreadLocal<SimpleDateFormat>() {
		@Override
		protected SimpleDateFormat initialValue() {
			return new SimpleDateFormat("yyyyMMdd HHmm");
		}
	};

	public static void main(String[] args) {
		ThreadLocalDemo obj= new ThreadLocalDemo();
		for(int i=0; i<5; i++) {
			Thread t = new Thread(obj, ""+i);
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
            t.start();
		}

	}
	
    @Override
    public void run() {
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" default Formatter = "+format.get().toPattern());
        try {
            Thread.sleep(new Random().nextInt(1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //formatter pattern is changed here by thread, but it won't reflect to other threads
        format.set(new SimpleDateFormat());
        
        System.out.println("Thread Name= "+Thread.currentThread().getName()+" formatter = "+format.get().toPattern());
    }

}
