package iches.science.chapter05;

import java.util.Scanner;

public class ScoreTest {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("반의 학생 수는? : ");
		int stdNum = stdIn.nextInt();
		int sum = 0;
		double average = 0;
		for(int i = 1; i<= stdNum ; i++) {
			System.out.print(i + "번 점수 : ");
			int score = stdIn.nextInt();
			sum += score;
		}
		average = (double) sum/ stdNum;
		System.out.println(stdNum + "명의 총점 : "+ sum);
		System.out.println(stdNum + "명의 평균 : "+ average);
	}
}
