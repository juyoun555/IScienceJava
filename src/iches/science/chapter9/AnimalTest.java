package iches.science.chapter9;

public class AnimalTest {
	public static void main(String[] args) {
		Cat ani1 = new Cat(3, "�丣�þ�" , "�߿���");
		Dog ani2 = new Dog(2, "�ú����� �㽺Ű", "�۸���");
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
