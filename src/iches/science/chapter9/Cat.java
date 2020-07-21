package iches.science.chapter9;

public class Cat extends Animal{
	private String name;

	public Cat(int age, String kind,String name) {
		super(age, kind);
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void hunt() {
		System.out.println("쥐를 잡을거야!!");
	}
	public void play() {
		System.out.println("모빌놀이가 좋아요~");
	}
	@Override
	public void printAnimalInfo() {
		System.out.println("이름 : " + this.name);
		super.printAnimalInfo();
	}
}
