package iches.science.chapter05;

public class GradeIfElseTest {
	public static void main(String[] args) {
		int gildong = 92;
		if(gildong >=90 && gildong <=100) {
			System.out.println("A�����Դϴ�.");
		}
		else if (gildong >= 80 && gildong <=90) {
			System.out.println("B�����Դϴ�.");
		}
		else if (gildong >= 70 && gildong <=80) {
			System.out.println("C�����Դϴ�.");
		}
		else if (gildong >= 60 && gildong <=50) {
			System.out.println("D�����Դϴ�.");
		}
		else if (gildong < 60 && gildong >=0){
			System.out.println("F�����Դϴ�.");
		}
		else {
			System.out.println("������ �߸����µǾ� �ֽ��ϴ�.");
		}

	}
}
