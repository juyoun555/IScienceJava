package iches.science.chapter9;

public class AnimalTest {
	public static void main(String[] args) {
		Cat ani1 = new Cat(3, "其福矫救" , "具克捞");
		Dog ani2 = new Dog(2, "矫海府救 倾胶虐", "港港捞");
		ani1.printAnimalInfo();
		ani1.run();
		ani1.hunt();
		ani1.play();
		System.out.println();
		ani2.printAnimalInfo();
		ani2.run();
		ani2.hunt();
	}
}
