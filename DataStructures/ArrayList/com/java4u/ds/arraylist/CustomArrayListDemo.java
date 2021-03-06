package com.java4u.ds.arraylist;

public class CustomArrayListDemo {

	public static void main(String[] args) {
		 ArrayListCustom<Employee> list = new ArrayListCustom<Employee>();
	     list.add(new Employee("1", "sam"));
	     list.add(new Employee("2", "amy"));
	     list.add(new Employee("3", "wil"));
	     list.add(new Employee("4", "cat"));
	     list.add(new Employee("1", "sam"));
	     list.add(new Employee("2", "amy"));
	     list.add(null);
	     
	     list.display();
	     System.out.println("\nelement at index "+1+" = "+list.get(1));
	     System.out.println("element removed from index "+1+" = "+list.remove(1));
	     
	     System.out.println("\nlet's display list again after removal at index 1");
	     
	     list.display();

	}

}
