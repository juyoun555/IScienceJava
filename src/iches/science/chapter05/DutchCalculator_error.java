package iches.science.chapter05;

import java.util.Scanner;

public class DutchCalculator_error {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int cha = stdIn.nextInt();
		int allExpense = 0;
		int numOfparticipants = 0;
		System.out.println("������ �������� ����Ǿ�����? : ");
		System.out.println("==========================");
		System.out.println("�������� �� ����� �Է��ϼ���.");
		for(int i =1; i<= cha; i++) {
			System.out.println(i+"�� ��� : ");
			int money = stdIn.nextInt();
			allExpense += money;
		}
		System.out.println("�Ѻ����" + allExpense + "�� �Դϴ�.");
		System.out.println("===================");
		System.out.println("������ �ο����� �Է��ϼ���");
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
