package icehs.science.chapter06;

public class Account {
	String accountName;
	String accountId;
	int balance;
	void deposit(int money) {
		if(money < 0 ) {
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else {
		System.out.println(money + "�� �Ա��մϴ�.");
		balance += money;
		System.out.println("�ܾ� : " + this.balance);
	
		}
		this.printBalance();
	}
	int withdraw(int money) {
		if(money < 0 ) {
			System.out.println("�ݾ��� ������ �Է��� �� �����ϴ�.");
		}
		else if(money > balance) System.out.println("�ܾ��� �����մϴ�.");
		else {
		
		System.out.println(money + "�� ����մϴ�.");
		this.balance -= money;
		System.out.println("�ܾ� : " + this.balance); 
		}
		this.printBalance();
		return money;// �޴� ������忡�� �� ������ �� �˾ƾ��ϴϲ�
		}
	void printBalance() {
		System.out.println("�ܾ� : " + this.balance + "��");
	}
	void printAccountInfo() {
		System.out.println("����  "+ this.accountId + "(������ : "+ this.accountName + ")");
		System.out.println("�ܾ� : " + this.balance + "��"); 
	}
}
