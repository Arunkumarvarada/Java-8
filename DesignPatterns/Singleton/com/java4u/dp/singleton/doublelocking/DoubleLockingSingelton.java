package com.java4u.dp.singleton.doublelocking;

public class DoubleLockingSingelton {
	private static DoubleLockingSingelton doubleLockingSingelton = null;
	
	private DoubleLockingSingelton() {}
	
	public static DoubleLockingSingelton getInstance() {
		if(null==doubleLockingSingelton) {
			synchronized (DoubleLockingSingelton.class) {
				if(null==doubleLockingSingelton) {
					doubleLockingSingelton= new DoubleLockingSingelton();
					return doubleLockingSingelton;
				}
			}
		}
		return doubleLockingSingelton;
	}
	
	public void show() {
		System.out.println("Inside the Double Locked Singleton!!");
	}

}
