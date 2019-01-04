package ua.lviv.lgs.minimum;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {

		TreeSet<Car> setCar = new TreeSet<>();
		setCar.add(new Car("Accord", 1020));
		setCar.add(new Car("Juke", 1560));
		setCar.add(new Car("Juke", 1270));
		setCar.add(new Car("Juke", 1340));
		setCar.add(new Car("Sens", 850));
		setCar.add(new Car("Duster", 1330));
		setCar.add(new Car("I30", 940));
		setCar.add(new Car("Ceed", 870));
		
		for (Car car : setCar) {
			System.out.println(car);
		}

		System.out.println();
		TreeSet<Car> setCar1 = new TreeSet<>(new CarComparator());
		setCar1.add(new Car("Accord", 1020));
		setCar1.add(new Car("Juke", 1560));
		setCar1.add(new Car("Juke", 1270));
		setCar1.add(new Car("Juke", 1340));
		setCar1.add(new Car("Sens", 850));
		setCar1.add(new Car("Duster", 1330));
		setCar1.add(new Car("I30", 940));
		setCar1.add(new Car("Ceed", 870));
		
		for (Car car : setCar1) {
			System.out.println(car);
		}

	}

}
