package iches.science.chapter10;

public class Person {
	private String name;
	private String phoneNumber;
	public Person() {
		
	}
	public Person(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	public void eat() {
		System.out.println("식사를 합니다.");
	}
	public void sleep() {
		System.out.println("잠을 잡니다.");
	}
}
