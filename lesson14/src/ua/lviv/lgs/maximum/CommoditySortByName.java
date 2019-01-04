package ua.lviv.lgs.maximum;

import java.util.Comparator;

public class CommoditySortByName implements Comparator<Commodity>{

	@Override
	public int compare(Commodity c0, Commodity c1) {
		return c0.getName().compareTo(c1.getName());
	}

}
