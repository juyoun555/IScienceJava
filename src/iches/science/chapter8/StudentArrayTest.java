package iches.science.chapter8;

public class StudentArrayTest {
	public static void main(String[] args) {
		/*Student[] stu = new Student[5];
		stu[0] = new Student("�̼���" , "stu001");
		stu[1] = new Student("ȫ�浿" , "stu002");
		stu[2] = new Student("������" , "stu003");
		stu[3] = new Student("����ġ" , "stu004");
		stu[4] = new Student("�豸" , "stu005");*/
		Student[] stu = {new Student("�̼���" , "stu001"),new Student("ȫ�浿" , "stu002"),new Student("������" , "stu003"),new Student("����ġ" , "stu004"),new Student("�豸" , "stu005")};
		for(int i = 0 ; i < stu.length;i++) {
			stu[i].printStudentInf();
		}
		System.out.println();
		for(Student student : stu) {   //���� ���� ����ġ ����
			student.printStudentInf();
		}
	}
}
