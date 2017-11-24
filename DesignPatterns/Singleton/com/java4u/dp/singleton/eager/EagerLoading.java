package com.java4u.dp.singleton.eager;

public class EagerLoading {

	private static EagerLoading eagerLoading = new EagerLoading();

	private EagerLoading() {

	}

	public static EagerLoading getIstance() {
		if (eagerLoading != null) {
			return eagerLoading;
		}
		return null;
	}
	
	public void show() {
		System.out.println("Inside the Eager Loading Singleton!!");
	}

}
