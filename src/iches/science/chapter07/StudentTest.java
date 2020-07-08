package iches.science.chapter07;

public class StudentTest {
	public static void main(String[] args) {
		Student stu1 = new Student();
		stu1.setName("홍길동");
		stu1.setGrade(4);
		System.out.println("학생성명:" + stu1.getName());
		System.out.println("학년:" + stu1.getGrade());
	}
}
