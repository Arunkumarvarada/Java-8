package com.java4u.ds.hashset;

public class CustromHashsetDemo {

	public static void main(String[] args) {
		CustomHashset<Integer> linkedHashSetCustom = new CustomHashset<Integer>();
		linkedHashSetCustom.add(21);
		linkedHashSetCustom.add(25);
		linkedHashSetCustom.add(30);
		linkedHashSetCustom.add(33);
		linkedHashSetCustom.add(35);

		System.out.println("LinkedHashSetCustom contains 21 =" + linkedHashSetCustom.contains(21));
		System.out.println("LinkedHashSetCustom contains 51 =" + linkedHashSetCustom.contains(51));

		System.out.print("Displaying LinkedHashSetCustom: ");
		linkedHashSetCustom.display();

		linkedHashSetCustom.remove(21);
		linkedHashSetCustom.remove(22);

		System.out.print("Displaying LinkedHashSetCustom: ");
		linkedHashSetCustom.display();

	}

}
