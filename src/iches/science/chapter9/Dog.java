package iches.science.chapter9;

public class Dog extends Animal{
	private String name;

	public Dog(int age, String kind, String name) {
		super(age, kind);
		this.name =name;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void hunt() {
		System.out.println("�ü� 40km�� �پ�!!");
	}
	@Override
	public void run() {
		 System.out.println("������ ��ƿ�~");
	}
	@Override
	public void printAnimalInfo() {
		System.out.println("�̸� : " + this.name);
		super.printAnimalInfo();
	}
}
