package iches.science.chapter9;

public class PersonObject {
	private String name;
	private String phoneNumber;
	public PersonObject(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		String result = "���� : " + this.name + "\n��ȭ��ȣ : " + this.phoneNumber;
		return result; 
	}
}
