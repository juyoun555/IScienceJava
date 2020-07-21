package iches.science.chapter8;

public class Account {
	private String numbers;
	private int balance;
	private double interestRate;
	public Account(String numbers, int balance, double interestRate) {
		this.numbers = numbers;
		this.balance = balance;
		this.interestRate = interestRate;
	}
	public String getNumbers() {
		return numbers;
	}
	public void setNumbers(String numbers) {
		this.numbers = numbers;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public int caculateInterest() {
		int interest =(int)( balance * interestRate/100);
		return interest;
	}
}
