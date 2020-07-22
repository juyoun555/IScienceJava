package iches.science.chapter10;

public class Class implements CanSwim, CanFly, CanFight{

	@Override
	public void fight() {
		System.out.println("싸운다");
	}

	@Override
	public void fly() {
		System.out.println("난다");
	}

	@Override
	public void swim() {
		System.out.println("헤엄친다.");
		
	}
	
	public void action() {
		
	}

}
