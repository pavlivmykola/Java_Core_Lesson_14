package ua.lviv.lgs.maximum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class CommodityArrayList {
	ArrayList<Commodity> commodityList = new ArrayList();
	
	public void addCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬водимо новий товар");
		System.out.println("¬вед≥ть назву товару");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть довжину товару");
		int length = sc.nextInt();
		System.out.println("¬вед≥ть ширину товару");
		int width = sc.nextInt();
		System.out.println("¬вед≥ть вагу товару");
		double weight = sc.nextDouble();
		commodityList.add(new Commodity(name,length,width, weight));
		System.out.println(commodityList);
	}

	public void deleteCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬идал€Їмо товар");
		System.out.println("¬вед≥ть назву товару");
		String name = sc.nextLine();
		System.out.println("¬вед≥ть довжину товару");
		int length = sc.nextInt();
		System.out.println("¬вед≥ть ширину товару");
		int width = sc.nextInt();
		System.out.println("¬вед≥ть вагу товару");
		double weight = sc.nextDouble();
		Iterator<Commodity> commodityIterator = commodityList.iterator();
		while (commodityIterator.hasNext()) {
			Commodity commodity = commodityIterator.next();
			if ((commodity.getName().equals(name)) 
					& (commodity.getLength()==length)
						& (commodity.getWidth()==width)
							& (commodity.getWeight()==weight)) {
								commodityIterator.remove();
								System.out.println("“овар видалено");
			}
		}
		System.out.println(commodityList);
	}
	

	public void changeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("«м≥нюЇмо товар");
		System.out.println("¬вед≥ть стару назву товару");
		String oldName = sc.nextLine();
		System.out.println("¬вед≥ть стару довжину товару");
		int oldLength = sc.nextInt();
		System.out.println("¬вед≥ть стару ширину товару");
		int oldWidth = sc.nextInt();
		System.out.println("¬вед≥ть стару вагу товару");
		double oldWeight = sc.nextDouble();
		System.out.println("¬вед≥ть нову назву товару");
		String newName = sc.next();
		System.out.println("¬вед≥ть нову довжину товару");
		int newLength = sc.nextInt();
		System.out.println("¬вед≥ть нову ширину товару");
		int newWidth = sc.nextInt();
		System.out.println("¬вед≥ть нову вагу товару");
		double newWeight = sc.nextDouble();

		Iterator<Commodity> commodityIterator = commodityList.iterator();
		while (commodityIterator.hasNext()) {
			Commodity commodity = commodityIterator.next();
			if ((commodity.getName().equals(oldName)) 
					& (commodity.getLength()==oldLength)
						& (commodity.getWidth()==oldWidth)
							& (commodity.getWeight()==oldWeight)) {
								System.out.println("“овар знайдено");
								commodity.setName(newName);
								commodity.setLength(newLength);
								commodity.setWidth(newWidth);
								commodity.setWeight(newWeight);
			}
		}
		System.out.println(commodityList);
	}
	
	
	
	public void sortByName() {
		commodityList.sort(new CommoditySortByName());
		System.out.println(commodityList);
	}

	
	public void sortByLength() {
		commodityList.sort(new CommoditySortByLength());
		System.out.println(commodityList);
	}
	
	public void sortByWidth() {
		commodityList.sort(new CommoditySortByWidth());
		System.out.println(commodityList);
	}

	
	public void sortByWeight() {
		commodityList.sort(new CommoditySortByWeight());
		System.out.println(commodityList);
	}
	
	
	public void getElement() {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬вед≥ть ≥ндекс елемента колекц≥њ в≥д 0 до "+(commodityList.size()-1));
		int i = sc.nextInt();
		if (i>(commodityList.size()-1)) {
			System.out.println("¬ведений ≥ндекс поза межами колекц≥њ");
		} else {
			System.out.println(i+" елемент колекц≥њ "+commodityList.get(i));
		}
	}
	
}
