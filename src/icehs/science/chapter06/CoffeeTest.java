package icehs.science.chapter06;

public class CoffeeTest {
	public static void main(String[] args) {
		Coffee ame = new Coffee();
		ame.type = "�Ƹ޸�ī��";
		ame.price = 3500;
		ame.printCoffeeInfo();
		Coffee latte = new Coffee();
		latte.type = "ī���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		Coffee maki = new Coffee();
		maki.type = "�����ƶ�";
		maki.price = 4500;
		maki.printCoffeeInfo();
		int sumOfCoffee = ame.price + latte.price + maki.price;
		System.out.println("�� �ݾ�:" + sumOfCoffee + "��");
		
	}
}
