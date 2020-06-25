package iches.science.chapter05;

public class VariousSumTest {
	public static void main(String[] args) {
		int sum = 0;
		int sumEven=0;
		int sumOdd=0;
		for(int i  = 1; i<=1000 ; i++) {
			if(i%2 ==0) {
				sumEven += i;
			}
			else {
				sumOdd += i;
			}
			sum+=i;
			
		}
		System.out.println(sum);
		System.out.println(sumEven);
		System.out.println(sumOdd);
	}
}
