package iches.science.chapter07;

public class ComputerTest {
	public static void main(String[] args) {
		Computer com1 = new Computer("R500", "Win 7", 100);
		com1.printComputerInfo();
		Computer com2 = new Computer("R570", "Win 10", 200, 30);
		com2.printComputerInfo();
	}
}
