package ch03;

public class StudentScore {
	public static void main(String[] args) {
		double math = 94.7;
		double eng= 83.2;
		double kor= 87.1;
		int intkor= (int) kor;
		int inteng= (int) eng;
		int intmath = (int) math;
		
		System.out.println("수학 : "+ intmath);
		System.out.println("영어 : "+ inteng);
		System.out.println("국어 : "+ intkor);
	}
}
