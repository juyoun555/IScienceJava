package iches.science.chapter11;

import java.util.HashMap;

public class StudentMapTest {
	public static void main(String[] args) {
		HashMap<String , Student> students = new HashMap();
		students.put("STU001", new Student("�̼���", 80,90,95));
		students.put("STU002", new Student("������", 95,89,92));
		students.put("STU003", new Student("������", 88,97,94));
		for(String stuId : students.keySet()) {
			System.out.println(stuId + "-" + students.get(stuId));
		}
	}
}
