package iches.science.chapter8;

public class Student {
	private String name;
	private String id;
	
	public Student() {
		
	}

	public Student(String name, String id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public void printStudentInf() {
		System.out.println("�л� ���� : " + this.name);
		System.out.println("�й� : " + this.id);
	}
}
