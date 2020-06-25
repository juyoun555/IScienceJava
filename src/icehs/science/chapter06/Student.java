package icehs.science.chapter06;

public class Student {
	String studentName;
	String studentId;
	int korean;
	int english;
	int math;
	int calculateAverage() {
		int average = (korean + english + math)/3;
		return average;
	}
	void printStudentInfo() {
		System.out.println("학번 : " + this.studentId);
		System.out.println("이름 : " + this.studentName);
		System.out.println("국어 성적 : " + this.korean);
		System.out.println("영어 성적 : " + this.english);
		System.out.println("수학 성적 : " + this.math);
		System.out.println("평균 성적 : " + this.calculateAverage());
	}
	void changStudentId(String newId) {
		this.studentId = newId;
	}
}
