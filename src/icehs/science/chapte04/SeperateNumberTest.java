package icehs.science.chapte04;

public class SeperateNumberTest {
	public static void main(String[] args) {
		int number = 456;
		int number2 = (int) number % 100;
		int number3 = (int) number % 10;
		System.out.println("���� �ڸ� �� : " + (number/100));
		System.out.println("���� �ڸ� �� : "+ (number2/10));
		System.out.println("���� �ڸ� �� : "+ number3);
	}
}
