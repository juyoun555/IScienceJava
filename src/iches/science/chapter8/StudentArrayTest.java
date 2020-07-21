package iches.science.chapter8;

public class StudentArrayTest {
	public static void main(String[] args) {
		/*Student[] stu = new Student[5];
		stu[0] = new Student("이순신" , "stu001");
		stu[1] = new Student("홍길동" , "stu002");
		stu[2] = new Student("강감찬" , "stu003");
		stu[3] = new Student("전우치" , "stu004");
		stu[4] = new Student("김구" , "stu005");*/
		Student[] stu = {new Student("이순신" , "stu001"),new Student("홍길동" , "stu002"),new Student("강감찬" , "stu003"),new Student("전우치" , "stu004"),new Student("김구" , "stu005")};
		for(int i = 0 ; i < stu.length;i++) {
			stu[i].printStudentInf();
		}
		System.out.println();
		for(Student student : stu) {   //향상된 포문 포이치 구문
			student.printStudentInf();
		}
	}
}
