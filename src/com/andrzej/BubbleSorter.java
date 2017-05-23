package com.andrzej;

/**
 * Created by andrzej on 22.05.17.
 */
public class BubbleSorter {


	public Person[] sortBubbleMethod(Person[] peopleTable) {
		Person temp = new Person(0, "", "");
//		int n = peopleTable.length;


		for (int i = 0; i < peopleTable.length - 1; i++) {


			for (int j = 0; j < (peopleTable.length - 1); j++) {

				if (peopleTable[j].getAge() > peopleTable[j + 1].getAge()) {

					temp = peopleTable[j + 1];

					peopleTable[j + 1] = peopleTable[j];

					peopleTable[j] = temp;

				}


			}


		}
		return peopleTable;


	}


	public Person[] sortBubbleUsingComparable(Person[] peopleTable) {
		Person temp = new Person(0, "", "");
		for (int i = 0; i < peopleTable.length - 1; i++) {


			for (int j = 0; j < (peopleTable.length - 1); j++) {

				if (peopleTable[j].compareTo(peopleTable[j + 1]) > 0) {

					temp = peopleTable[j + 1];

					peopleTable[j + 1] = peopleTable[j];

					peopleTable[j] = temp;

				}


			}


		}
		return peopleTable;
	}

}
