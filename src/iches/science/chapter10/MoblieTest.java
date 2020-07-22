package iches.science.chapter10;

public class MoblieTest {
	public static void main(String[] args) {
		Mobile[] phones = {
			new Galaxy(),
			new IPhone()
		};
		((Galaxy)phones[0]).setOsVersion("안드로이드 오레오");
		phones[0].call(5);
		phones[0].charge(30);
		((IPhone)phones[1]).setColor("흰색");
		phones[1].call(10);
		phones[1].charge(15);
		Cooplay galaxy = new Galaxy();
		galaxy.buy("게임", 1000);
	}
}
