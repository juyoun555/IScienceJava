package iches.science.chapter07;

public class Student {
	private String name;
	private int grade;
	
	public void setName(String name) {   //�ɹ������� ���� �κп��� set�̶� �� ���͸޼ҵ�(setter method)�� �ѵ�
		this.name = name;
	}
	
	public void setGrade(int grade) {
		if(grade>3 || grade <0) {
			System.out.println("�г��� �߸� �Է��Ͽ����ϴ�.");
		}else {
			this.grade = grade;
		}
	}
	
	public String getName() {     // ����Ÿ���� ������ Ÿ���� ������, get�� �ٿ� �� ���� ������ gettermethod �����
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
}
