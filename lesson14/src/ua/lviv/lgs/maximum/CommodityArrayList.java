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
		System.out.println("������� ����� �����");
		System.out.println("������ ����� ������");
		String name = sc.nextLine();
		System.out.println("������ ������� ������");
		int length = sc.nextInt();
		System.out.println("������ ������ ������");
		int width = sc.nextInt();
		System.out.println("������ ���� ������");
		double weight = sc.nextDouble();
		commodityList.add(new Commodity(name,length,width, weight));
		System.out.println(commodityList);
	}

	public void deleteCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������� �����");
		System.out.println("������ ����� ������");
		String name = sc.nextLine();
		System.out.println("������ ������� ������");
		int length = sc.nextInt();
		System.out.println("������ ������ ������");
		int width = sc.nextInt();
		System.out.println("������ ���� ������");
		double weight = sc.nextDouble();
		Iterator<Commodity> commodityIterator = commodityList.iterator();
		while (commodityIterator.hasNext()) {
			Commodity commodity = commodityIterator.next();
			if ((commodity.getName().equals(name)) 
					& (commodity.getLength()==length)
						& (commodity.getWidth()==width)
							& (commodity.getWeight()==weight)) {
								commodityIterator.remove();
								System.out.println("����� ��������");
			}
		}
		System.out.println(commodityList);
	}
	

	public void changeCommodity() {
		Scanner sc = new Scanner(System.in);
		System.out.println("������� �����");
		System.out.println("������ ����� ����� ������");
		String oldName = sc.nextLine();
		System.out.println("������ ����� ������� ������");
		int oldLength = sc.nextInt();
		System.out.println("������ ����� ������ ������");
		int oldWidth = sc.nextInt();
		System.out.println("������ ����� ���� ������");
		double oldWeight = sc.nextDouble();
		System.out.println("������ ���� ����� ������");
		String newName = sc.next();
		System.out.println("������ ���� ������� ������");
		int newLength = sc.nextInt();
		System.out.println("������ ���� ������ ������");
		int newWidth = sc.nextInt();
		System.out.println("������ ���� ���� ������");
		double newWeight = sc.nextDouble();

		Iterator<Commodity> commodityIterator = commodityList.iterator();
		while (commodityIterator.hasNext()) {
			Commodity commodity = commodityIterator.next();
			if ((commodity.getName().equals(oldName)) 
					& (commodity.getLength()==oldLength)
						& (commodity.getWidth()==oldWidth)
							& (commodity.getWeight()==oldWeight)) {
								System.out.println("����� ��������");
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
		System.out.println("������ ������ �������� �������� �� 0 �� "+(commodityList.size()-1));
		int i = sc.nextInt();
		if (i>(commodityList.size()-1)) {
			System.out.println("�������� ������ ���� ������ ��������");
		} else {
			System.out.println(i+" ������� �������� "+commodityList.get(i));
		}
	}
	
}
