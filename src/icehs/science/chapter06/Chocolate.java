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
	int caculateTotalPrice(int count, double discount) {
		return (int)(count * price * (100- discount) / 100 );
	}
	void changeChocolateInfo(String name, int price) {
		this.name = name;
		this.price = price;
		this.printChocolateInfo();
	}
	void changeChocolateInfo(String name, String type, int price) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.printChocolateInfo();
	}
	void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " 
	+ type + ", 가격 : "+ price);
	}
	
}
