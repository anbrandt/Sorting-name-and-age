package com.andrzej;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person(33, "Tadeusz", "Kowalski");
		Person person2 = new Person(45, "Henryk", "Batory");
		Person person3 = new Person(42, "Jan", "Batory");
		Person person4 = new Person(44, "Aaciek", "Lem");
		Person person5 = new Person(89, "Tomasz", "Tomaszewski");
		Person person6 = new Person(99, "Witold", "Macierewicz");
		Person person7 = new Person(103, "Adam", "Mickiewicz");
		Person person8 = new Person(3, "Adam", "Miałczyński");

		Person[] tableofPeople = {person1, person2, person3, person4, person5, person6, person7, person8};

		System.out.println("Bubble Sorter");
		System.out.println("--------------");
		BubbleSorter bub1 = new BubbleSorter();
		bub1.sortBubbleMethod(tableofPeople);

		for (int i = 0; i < tableofPeople.length; i++) {
			System.out.println("i = " + i + ", Age is " + tableofPeople[i].getAge() + " and his name is " + tableofPeople[i].getName());

		}


		System.out.println();
		System.out.println("Selection Sorter");
		System.out.println("------------------");

		SelectionSorter sele1 = new SelectionSorter();
		sele1.selecionSortMethod(tableofPeople);

		for (int i = 0; i < tableofPeople.length; i++) {
			System.out.println("i = " + i + ", Age is " + tableofPeople[i].getAge() + " and his name is " + tableofPeople[i].getName());

		}

		System.out.println();
		System.out.println("Bubble Sorter with Comparable");
		System.out.println("------------------");
		BubbleSorter bub2 = new BubbleSorter();
		bub2.sortBubbleUsingComparable(tableofPeople);

		for (int i = 0; i < tableofPeople.length; i++) {
			System.out.println("i = " + i + ", AGE " + tableofPeople[i].getAge() + " NAME " + tableofPeople[i].getName() +
					" SURNAME: " + tableofPeople[i].getSurname());

		}




		bub1.sortBubbleUsingComparable(tableofPeople);
		int middle = tableofPeople.length/2;

		if (tableofPeople.length%2 == 1) {

		}
		System.out.println();
		System.out.println();
		median medianMethod = new median();

		System.out.println("Median for table is: " + medianMethod.median(tableofPeople));

	}


//method that prints the median from the table

	public static Person[] getMedian(Person[] peoplePerson) {
		if (peoplePerson.length % 2 == 0) {

			System.out.println();
		} else {

		}


		return peoplePerson;
	}
}
