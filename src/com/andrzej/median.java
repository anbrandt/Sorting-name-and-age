package com.andrzej;

/**
 * Created by andrzej on 23.05.17.
 */
public class median {

	public double median(Person[] people) {
		if (people.length % 2 == 0) {
			double med = 0.0;
			int m1 = people[people.length / 2].getAge();
			int m2 = people[(people.length / 2) - 1].getAge();
			med = (m1 + m2) / 2;
			return med;

		} else {
			double med = 0.0;
			int m1 = people[(people.length + 1) / 2 - 1].getAge();
			med = m1;
			return med;
		}
	}

}
