package com.java4u.dp.singleton.staticsingleton;

public class StaticSingleton {
	private static StaticSingleton staticSingleton = null;

	static {
		staticSingleton = new StaticSingleton();
	}

	private StaticSingleton() {
	}

	public static StaticSingleton getInstance() {
		if (staticSingleton != null) {
			return staticSingleton;
		}
		return staticSingleton;
	}

	public void showMessage() {
		System.out.println("Inside the static Singleton!!");
	}
}
