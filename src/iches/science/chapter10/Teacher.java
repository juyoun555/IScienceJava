package iches.science.chapter10;

public class Teacher extends Person {
	private String department;
	public void teach() {
		System.out.println("����Ĩ�ϴ�.");
	}
	
	@Override
	public void eat(){
		System.out.println("�ٰ��� �Ծ��.");
	}
}
