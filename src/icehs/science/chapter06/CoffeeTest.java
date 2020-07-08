package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.type = "아메리카노";
		ame.price = 3500;
		ame.printCoffeeInfo();
		Coffee latte = new Coffee();
		latte.type = "카페라떼";
		latte.price = 4000;
		latte.printCoffeeInfo();
		Coffee maki = new Coffee();
		maki.type = "마끼아또";
		maki.price = 4500;
		maki.printCoffeeInfo();
		int sumOfCoffee = ame.price + latte.price + maki.price;
		System.out.println("총 금액:" + sumOfCoffee + "원");
		
	}
}
