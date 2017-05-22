package com.andrzej;

import java.util.Comparator;

/**
 * Created by andrzej on 22.05.17.
 */
public class Person implements Comparable<Person> {

	private int age;
	private String name;
	private String surname;


	public Person(int age, String name, String surname) {
		this.age = age;
		this.name = name;
		this.surname = surname;

	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public int compareTo(Person secondPerson) {
		if (this.getAge() > secondPerson.getAge()) {
			return 1;
		} else if (this.getAge() < secondPerson.getAge())
			if (this.getSurname().compareTo(secondPerson.getSurname()) == 0){
			return this.getName().compareTo(secondPerson.getName());
		} else {
			return this.getName().compareTo(secondPerson.getName());
		} else
			return -1;
	}
}
