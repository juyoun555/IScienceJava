package iches.science.chapter11;

import java.util.HashMap;

public class StudentMapTest {
	public static void main(String[] args) {
		HashMap<String , Student> students = new HashMap();
		students.put("STU001", new Student("이순신", 80,90,95));
		students.put("STU002", new Student("김유신", 95,89,92));
		students.put("STU003", new Student("강감찬", 88,97,94));
		for(String stuId : students.keySet()) {
			System.out.println(stuId + "-" + students.get(stuId));
		}
	}
}
