package iches.science.chapter10;

public class Class implements CanSwim, CanFly, CanFight{

	@Override
	public void fight() {
		System.out.println("�ο��");
	}

	@Override
	public void fly() {
		System.out.println("����");
	}

	@Override
	public void swim() {
		System.out.println("���ģ��.");
		
	}
	
	public void action() {
		
	}

}
