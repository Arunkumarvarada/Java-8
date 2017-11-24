package com.java4u.dp.singleton.test;

import com.java4u.dp.singleton.doublelocking.DoubleLockingSingelton;
import com.java4u.dp.singleton.eager.EagerLoading;
import com.java4u.dp.singleton.enumsingelton.EnumSingleton;
import com.java4u.dp.singleton.lazy.LazyLoading;
import com.java4u.dp.singleton.staticsingleton.StaticSingleton;

public class SingletonTest {

	public static void main(String[] args) {
		System.out.println("Main Class Singelton Testing starts");

		try {
			DoubleLockingSingelton.getInstance().show();
			EnumSingleton.INSTANCE.showMessage();
			EagerLoading.getIstance().show();
			StaticSingleton.getInstance().showMessage();
			LazyLoading.getInstance().showMessage();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Main Class Singelton Testing ends");
	}

}
