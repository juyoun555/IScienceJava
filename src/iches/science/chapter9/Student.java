package iches.science.chapter9;

public class Student extends Person {
	/*private String name;
	private String phoneNumber;*/
	private String department;
	public Student() {
		//super();�� �����Ȱ���
	}//person �� ����ִ°� ������ ������!!
	public Student(String name, String phoneNumber, String depatment) {
		super(name, phoneNumber);
		this.department = depatment;
	}
	/*public void eat() {
		System.out.println("�Ļ縦 �մϴ�.");
	}
	public void sleep() {
		System.out.println("���� ��ϴ�.");
	}*/
	public void study() {
		System.out.println("���θ� �մϴ�.");
	}
	
	@Override  //����üũ�� ����
	public void eat() {
		System.out.println("������ �Ծ��.");
	}
}
