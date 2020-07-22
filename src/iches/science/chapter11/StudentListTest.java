package iches.science.chapter11;

import java.util.ArrayList;

public class StudentListTest {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList();
		list.add(new Student("이순신", 80,90,95));
		list.add(new Student("김유신",95,89,92));
		list.add(new Student("강감찬",88,97,94));
		
		for(Student stu : list) {
			System.out.println(stu);
		}
	}
}
