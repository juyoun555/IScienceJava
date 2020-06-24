package icehs.science.chapte04;

public class TemperatureTest {
	 public static void main(String[] args) {
		int F= 100;
		double C= (double) 5 / 9 * (F-32); // 명시적으로 캐스팅 하는게 필요
		System.out.println("화씨 : " + F);
		System.out.println("섭씨 : " + C);
	}
}
