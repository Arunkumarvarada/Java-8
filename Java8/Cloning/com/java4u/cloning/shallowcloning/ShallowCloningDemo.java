package com.java4u.cloning.shallowcloning;

public class ShallowCloningDemo {

	public static void main(String[] args) {
		Course course = new Course("Physics", "Chemistry", "Biology");
		Student student1 = new Student(111, "John", course);
		Student student2 = null;

		try {
			student2 = (Student) student1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		System.out.println(student1.getCourse().getSubject3());
		student2.getCourse().setSubject3("Maths");
		System.out.println(student1.getCourse().getSubject3());
	}

}
