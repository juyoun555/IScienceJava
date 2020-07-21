package iches.science.chapter9;

public class FundAccount extends Account {
	private double earningRate;
	
	public FundAccount(String number, String name, int balance, double earningRate) {
		super(number, name, balance);
		this.earningRate = earningRate;
	}

	public double getEarningRate() {
		return earningRate;
	}

	public void setEarningRate(double earningRate) {
		this.earningRate = earningRate;
	}
	public void earnMoney() {
		System.out.println("수익이 발생했습니다.");
	}
	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println("수익률 : "+ this.earningRate + "%");
		this.earnMoney();
	}
}
