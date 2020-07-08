package icehs.science.chapter06;

public class ChocolateTest {
	public static void main(String[] args) {
		Chocolate choco = new Chocolate();
		choco.name = "아마도라";
		choco.type = "다크";
		choco.price = 2200;
		choco.printChocolateInfo();
		String chocoName = choco.getName();
		int totalPrice = choco.caculateTotalPrice(20);
		System.out.println(chocoName + "초콜렛 20개 : " + totalPrice);
		choco.changeChocolateInfo("카페키리쉬", 2500);
		totalPrice = choco.caculateTotalPrice(15, 10);
		System.out.println(choco.name + "15개(10%할인) : " + totalPrice );
		choco.changeChocolateInfo("트리플 블랑", "화이트", 2300);
	} 
}
