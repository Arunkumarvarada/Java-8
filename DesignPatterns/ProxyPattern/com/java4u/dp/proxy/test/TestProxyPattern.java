package com.java4u.dp.proxy.test;

import com.java4u.dp.proxy.Image;
import com.java4u.dp.proxy.ProxyImage;

public class TestProxyPattern {

	public static void main(String[] args) {
		Image image = new ProxyImage("test_Image.jpg");

		image.display();
		System.out.println("");
		image.display();
	}

}
