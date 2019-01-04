package ua.lviv.lgs.minimum;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {

	@Override
	public int compare(Car car0, Car car1) {
			if (car0.getModel().compareTo(car1.getModel())>0) {
				return 1;
			}else if (car0.getModel().compareTo(car1.getModel())<0) {
				return -1;
			} else {
				return (car0.getWeight()>car1.getWeight()) ? 1:-1;
			}
	}

}
