package iches.science.chapter11;

public class Student {
	private String name;
	private String[] subject = { "국어","영어 ", "수학"};
	private int[] score = new int[3];
	public Student(String name, int kor , int eng, int math) {
		this.name = name;
		score[0] = kor;
		score[1] = eng;
		score[2] = math;
	}
	public String toString() {
		return this.name + "( " +subject[0] + " : " + score[0]
				+subject[1] + " : " +score[1] + subject[2] + " : " +score[2]+ " ) ";
	}
}
