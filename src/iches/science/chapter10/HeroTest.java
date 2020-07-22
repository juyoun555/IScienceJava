package iches.science.chapter10;

public class HeroTest {
	public static void main(String[] args) {
		Class[] heroes = {
				new SuperMan(),
				new BatMan(),
				new SpiderMan()
		};
		System.out.println("Hero ¸ñ·Ï:" + heroes[0] +"," + heroes[1] + "," + heroes[2]);
	for(Class hero : heroes) {
		hero.action();
	}
	}
}
