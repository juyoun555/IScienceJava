package iches.science.chapter10;

import sun.awt.AWTAccessor.SystemTrayAccessor;

public class AnimalTest {
	public static void main(String[] args) {
		
	
		Bird eagle = new Bird("독수리",3,"바위산 등");
		System.out.println(eagle);
		eagle.spreadWings();
		eagle.fly();
	}
}
