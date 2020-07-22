package iches.science.chapter10;

public class Teacher extends Person {
	private String department;
	public void teach() {
		System.out.println("가르칩니다.");
	}
	
	@Override
	public void eat(){
		System.out.println("다같이 먹어요.");
	}
}
