package icehs.science.chapter06;

public class Chocolate {
	String name;
	String type;
	int price;
	String getName() {
		return name;
	}
	int caculateTotalPrice(int count) {
		return count * price;
	}
	void changeChocolateInfo(String newName, int newPrice) {
		name = newName;
		price = newPrice;
	}
	void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " 
	+ type + ", 가격 : "+ price);
	}
	
}
