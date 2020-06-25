package icehs.science.chapter06;

public class StudentTest {
	public static void main(String[] args) {
		Student gildong = new Student();
		gildong.studentName = "ȫ�浿";
		gildong.studentId ="S001";
		gildong.korean = 94;
		gildong.english = 80;
		gildong.math = 89;
		gildong.changStudentId("STU0001");
		gildong.printStudentInfo();
	}
}
