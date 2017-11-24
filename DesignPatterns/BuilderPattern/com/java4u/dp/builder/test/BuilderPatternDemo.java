package com.java4u.dp.builder.test;

import com.java4u.dp.builder.Person;

public class BuilderPatternDemo {

	public static void main(String[] args) {
		Person person= new Person.PersonBuilder("arun", "arunkumar.varada@gmail.com").setAge(23).setUniversity("VTU").build();

		System.out.println(person);
	}

}
