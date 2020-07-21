package iches.science.chapter8;

public class Chocolate {
	private String name;
	private String type;
	private int price;
	
	public Chocolate(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public int caculateTotalPrice(int count) {
		return count * price;
	}
	public int caculateTotalPrice(int count, double discount) {
		return (int)(count * price * (100- discount) / 100 );
	}
	public void changeChocolateInfo(String name, int price) {
		this.name = name;
		this.price = price;
		this.printChocolateInfo();
	}
	public void changeChocolateInfo(String name, String type, int price) {
		this.name = name;
		this.price = price;
		this.type = type;
		this.printChocolateInfo();
	}
	public void printChocolateInfo() {
		System.out.println("이름 : " + name + ", 종류 : " 
	+ type + ", 가격 : "+ price);
	}
	
}
