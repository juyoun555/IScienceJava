package iches.science.chapter9;

public class PersonObjectTest {
	public static void main(String[] args) {
		PersonObject p1 = new PersonObject("이순신","1111-2222");
		System.out.println(p1);
		System.out.println(p1.toString());
		PersonObject p2 = new PersonObject("강감찬","3333-2222");
		System.out.println(p2);
	}
}
