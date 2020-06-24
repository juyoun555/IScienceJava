package iches.science.chapter05;

public class GradeIfElseTest {
	public static void main(String[] args) {
		int gildong = 92;
		if(gildong >=90 && gildong <=100) {
			System.out.println("A학점입니다.");
		}
		else if (gildong >= 80 && gildong <=90) {
			System.out.println("B학점입니다.");
		}
		else if (gildong >= 70 && gildong <=80) {
			System.out.println("C학점입니다.");
		}
		else if (gildong >= 60 && gildong <=50) {
			System.out.println("D학점입니다.");
		}
		else if (gildong < 60 && gildong >=0){
			System.out.println("F학점입니다.");
		}
		else {
			System.out.println("점수가 잘못힙력되어 있습니다.");
		}

	}
}
