package iches.science.chapter07;

public class Product {
	String name;
	int price;
	int discont;
	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public Product(String name, int price, int discont) {
		this.name = name;
		this.price = price;
		this.discont = discont;
	}
	
	void printProductInfo() {
		System.out.println("=====" + this.name + "=====");
		System.out.println("정가: " + this.price + "원");
		if(this.discont == 0) {
			System.out.println("할인율 : 할인하지 않음");
		}
		else{
			System.out.println("할인율 : " + this.discont + "%");
		}
		
	}
}
