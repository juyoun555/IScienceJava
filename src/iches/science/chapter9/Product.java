package iches.science.chapter9;

public class Product {
	private String name;
	private int price;
	private int discount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
	public Product(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}
	public int calculateDiscountPrice() {
		return this.price*(100-this.discount)/100;
	}
	public void printProductInfo() {
		System.out.println("��ǰ�� : " + this.name);
		System.out.println("���� : " + this.price + "(������ : " + this.discount + "%)");
		System.out.println("�ǸŰ� : " + this.calculateDiscountPrice());
	}
}
