package iches.science.chapter10;

public class FundAccount extends Account {
	private double earningRate;
	private int princpal;
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
		this.princpal = this.getBalance();		
		int myBalance = (int)(this.getBalance()*(1+ this.earningRate/100));
		this.setBalance(myBalance);
		}
	@Override
	public void openAccount() {
		super.openAccount();
		System.out.println("¼öÀÍ·ü : "+ this.earningRate + "%");
		this.earnMoney();
	}
	
	@Override
	public String toString() {
		this.earnMoney();
		String result = "ÆÝµå" + super.toString();
		result += "\n¼öÀÍ·ü : " + this.earningRate + "% (¿ø±Ý : " + this.princpal
				+")";
		return result;
	}
}
