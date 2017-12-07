package com.java4u.intelinterview;

public class Threadtest  implements Runnable{

	private Thread t;
	private String name;
	public static void main(String[] args) {
		Threadtest a= new Threadtest("A");
		Threadtest b= new Threadtest("B");
		a.start();
		b.start();

	}
	Threadtest(String n){
		this.name=n;
	}

	@Override
	public void run() {
		while(true) {
			System.out.print(name);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void start() {
		if(t==null) {
			t= new Thread(this, name);
			t.start();
		}
	}

}
