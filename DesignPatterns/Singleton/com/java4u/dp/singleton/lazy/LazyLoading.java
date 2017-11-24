package com.java4u.dp.singleton.lazy;

public class LazyLoading {

	private static LazyLoading lazyLoading = null;

	private LazyLoading() {
	}

	public static LazyLoading getInstance() {
		if (lazyLoading == null) {
			lazyLoading = new LazyLoading();
			return lazyLoading;
		}
		return lazyLoading;
	}

	public void showMessage() {
		System.out.println("Inside the Lazy Loading Singleton!!");
	}
}
