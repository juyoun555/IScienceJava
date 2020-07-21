package iches.science.chapter9;

public class Teacher extends Person {
	/*private String name;
	private String phoneNumber;*/
	private String department;
	/*public void eat() {
		System.out.println("식사를 합니다.");
	}
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}*/
	public void teach() {
		System.out.println("가르칩니다.");
	}
	
	@Override
	public void eat(){
		System.out.println("다같이 먹어요.");
	}
}
