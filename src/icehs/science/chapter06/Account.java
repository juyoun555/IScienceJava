package icehs.science.chapter06;

public class Account {
	String accountName;
	String accountId;
	int balance;
	void deposit(int money) {
		if(money < 0 ) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}
		else {
		System.out.println(money + "원 입금합니다.");
		balance += money;
		System.out.println("잔액 : " + this.balance);
	
		}
		this.printBalance();
	}
	int withdraw(int money) {
		if(money < 0 ) {
			System.out.println("금액은 음수를 입력할 수 없습니다.");
		}
		else if(money > balance) System.out.println("잔액이 부족합니다.");
		else {
		
		System.out.println(money + "원 출금합니다.");
		this.balance -= money;
		System.out.println("잔액 : " + this.balance); 
		}
		this.printBalance();
		return money;// 받는 사람입장에서 얼마 들어오는 지 알아야하니껜
		}
	void printBalance() {
		System.out.println("잔액 : " + this.balance + "원");
	}
	void printAccountInfo() {
		System.out.println("계좌  "+ this.accountId + "(예금주 : "+ this.accountName + ")");
		System.out.println("잔액 : " + this.balance + "원"); 
	}
}
