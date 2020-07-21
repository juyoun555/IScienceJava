package iches.science.chapter9;

public class Student extends Person {
	/*private String name;
	private String phoneNumber;*/
	private String department;
	public Student() {
		//super();이 생략된거임
	}//person 에 비어있는게 없으면 오류남!!
	public Student(String name, String phoneNumber, String depatment) {
		super(name, phoneNumber);
		this.department = depatment;
	}
	/*public void eat() {
		System.out.println("식사를 합니다.");
	}
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}*/
	public void study() {
		System.out.println("공부를 합니다.");
	}
	
	@Override  //문법체크를 해줌
	public void eat() {
		System.out.println("조별로 먹어요.");
	}
}
