package com.java4u.dp.builder;

public class Person {
	private final String name;
	private final String email;
	private int age;
	private String university;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public int getAge() {
		return age;
	}

	public String getUniversity() {
		return university;
	}

	public Person(PersonBuilder builder) {
		this.age = builder.age;
		this.name = builder.name;
		this.university = builder.university;
		this.email = builder.email;
	}

	public static class PersonBuilder {
		private String name;
		private String email;
		private int age;
		private String university;

		public PersonBuilder(String name, String email) {
			this.name = name;
			this.email = email;
		}

		public PersonBuilder setAge(int age) {
			this.age = age;
			return this;
		}

		public PersonBuilder setUniversity(String university) {
			this.university = university;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", age=" + age + ", university=" + university + "]";
	}

}
