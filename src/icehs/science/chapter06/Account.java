package icehs.science.chapter06;

public class Account {
	String accountName;
	String accountId;
	int balance;
	void deposit(int money) {
		System.out.println(money + "�� �Ա��մϴ�.");
		balance += money;
		System.out.println("�ܾ� : " + this.balance);
	}
	int withdraw(int money) {
		System.out.println(money + "�� ����մϴ�.");
		this.balance -= money;
		System.out.println("�ܾ� : " + this.balance);
		return money; // �޴� ������忡�� �� ������ �� �˾ƾ��ϴϲ�
	}
	void printAccountInfo() {
		System.out.println("����  "+ this.accountId + "(������ : "+ this.accountName + ")");
		System.out.println("�ܾ� : " + this.balance + "��"); 
	}
}
