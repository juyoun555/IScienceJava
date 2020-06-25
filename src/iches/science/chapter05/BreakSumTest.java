package iches.science.chapter05;

public class BreakSumTest {
	public static void main(String[] args) {
		int sum = 0;
		for(int i =0; i <= 10 ; i++) {
			sum+= i;
			if(sum > 30) {
				break;
			}
		}
		System.out.println("합계 결과 : " + sum);
	}
}
