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
		System.out.println("�й� : " + this.studentId);
		System.out.println("�̸� : " + this.studentName);
		System.out.println("���� ���� : " + this.korean);
		System.out.println("���� ���� : " + this.english);
		System.out.println("���� ���� : " + this.math);
		System.out.println("��� ���� : " + this.calculateAverage());
	}
	void changStudentId(String newId) {
		this.studentId = newId;
	}
}
