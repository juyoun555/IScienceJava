package iches.science.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double discountRate;
	public ItBook(String title, int price, double discountRate) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	} 
	public void setPrice( int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return this.discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	private int calculatePriceWithDiscount() {
		double afterPrice = this.price * (100-this.discountRate)/100 ;
		return (int)afterPrice;
	}
	public void printItBookInfo() {
		System.out.println("제목 : " + this.title + ", 정가 : " + this.price + " 원, 할인율 : " + this.discountRate + "%, 할인가 : "+ calculatePriceWithDiscount()  + " 원");
	}
}
