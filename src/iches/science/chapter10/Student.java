package iches.science.chapter10;

public class Student extends Person {
	private String department;
	public Student() {
		//super();�� �����Ȱ���
	}//person �� ����ִ°� ������ ������!!
	public Student(String name, String phoneNumber, String depatment) {
		super(name, phoneNumber);
		this.department = depatment;
	}
	public void study() {
		System.out.println("���θ� �մϴ�.");
	}
	
	@Override  //����üũ�� ����
	public void eat() {
		System.out.println("������ �Ծ��.");
	}
}
