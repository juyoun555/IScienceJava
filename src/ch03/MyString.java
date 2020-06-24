package ch03;

public class MyString {
	public static void main(String[] args) {
		String name ="홍길동";
		String lee = "이순신";
		String we=name+lee;
		String strAge = "23";
		int age = Integer.parseInt(strAge);
		System.out.println("구병국과 근무를 같이 한 사람들 : " + name + "," + lee);
		System.out.println("합체한 사람 : "+we);
		System.out.println("내년의 나의 나이 : " + (age + 1));		
	}
}
