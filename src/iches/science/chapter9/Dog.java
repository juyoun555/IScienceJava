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
		System.out.println("시속 40km로 뛰어!!");
	}
	@Override
	public void run() {
		 System.out.println("순록을 잡아요~");
	}
	@Override
	public void printAnimalInfo() {
		System.out.println("이름 : " + this.name);
		super.printAnimalInfo();
	}
}
