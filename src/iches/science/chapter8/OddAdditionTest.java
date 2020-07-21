package iches.science.chapter8;

public class OddAdditionTest {
	public static void main(String[] args) {
		int[] numbers = {10,21,33,42,51,64,79,80};
		int oddSum = 0 ;
		for(int num : numbers) {
			if(num%2==1) {
				System.out.print(num + " ");
				oddSum +=num;
			}
		}
		System.out.println();
		System.out.println("홀수들의 합계는" + oddSum + "입니다.");
	}
}
