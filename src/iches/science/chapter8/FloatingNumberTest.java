package iches.science.chapter8;

public class FloatingNumberTest {
	public static void main(String[] args) {
		double sum = 0;
		for(int i =0 ; i <10 ; i++) {
			sum += 0.1;
		}
		System.out.println(sum); //부동소수점 오류
	}
}
