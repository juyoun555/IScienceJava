package ch03;

public class EmployeeInformation {
	public static void main(String[] args) {
		String name = "홍길동";
		int nowYear = 2017;
		int inYear = 2002;
		System.out.println("이름 : " + name);
		System.out.println("입사년도 : " + inYear);
		System.out.println("근무년수 : " + (nowYear - inYear));
	}
}
