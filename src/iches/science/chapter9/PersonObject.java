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
		String result = "성명 : " + this.name + "\n전화번호 : " + this.phoneNumber;
		return result; 
	}
}
