package iches.science.chapter05;

import java.util.Scanner;

public class DutchCalculator_error {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int cha = stdIn.nextInt();
		int allExpense = 0;
		int numOfparticipants = 0;
		System.out.println("모임이 몇차까지 진행되었나요? : ");
		System.out.println("==========================");
		System.out.println("차수에서 쓴 비용을 입력하세요.");
		for(int i =1; i<= cha; i++) {
			System.out.println(i+"차 비용 : ");
			int money = stdIn.nextInt();
			allExpense += money;
		}
		System.out.println("총비용은" + allExpense + "원 입니다.");
		System.out.println("===================");
		System.out.println("모임의 인원수를 입력하세요");
		numOfparticipants = stdIn.nextInt();
		int partMoney = allExpense/numOfparticipants;
		for(int i = 1; i <= numOfparticipants; i++) {
			if(i != numOfparticipants) {
				System.out.println(i + ":" + partMoney);
				allExpense-= partMoney;
			}
			else {
				System.err.println(i + ":" + allExpense);
			}
		}
	}
}
