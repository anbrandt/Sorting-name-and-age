package com.andrzej;

/**
 * Created by andrzej on 22.05.17.
 */
public class SelectionSorter {

	public Person[] selecionSortMethod(Person[] peopleTable) {
		Person temp = new Person(0, "", "");
		for (int i = 0; i < peopleTable.length - 1; i++) {
			int indexInt = i;


			//loop looks for the smallest number
			for (int j = i + 1; j < peopleTable.length; j++) {
				if (peopleTable[j].getAge() < peopleTable[indexInt].getAge()) {
					indexInt = j;
				}

			}
			Person smallerAge = peopleTable[indexInt];

			peopleTable[indexInt] = peopleTable[i];

			peopleTable[i] = smallerAge;

		}


		return peopleTable;
	}

}
