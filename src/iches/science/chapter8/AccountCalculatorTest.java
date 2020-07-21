package iches.science.chapter8;

public class AccountCalculatorTest {
	public static void main(String[] args) {
		Account[] accArray = new Account[5];
		for(int i = 0 ; i < accArray.length ; i++) {
			accArray[i] = new Account("111-2222-555" + (i+1),10000*(i+1), 45/1000);
			System.out.println("계좌번호 : " + accArray[i].getNumbers() + "/잔액 : " + accArray[i].getBalance() + "원 / 이율 : " + accArray[i].getInterestRate()*100+"%");
		}
		System.out.println("이율을 변경합니다.");
		for(Account acc:accArray) {
			acc.setInterestRate(3.7);
			System.out.println("계좌번호:" + acc.getNumbers() + "/이율 :" + acc.getInterestRate() +"% / 잔액 : "+(acc.getBalance()+ acc.caculateInterest()));
		}
	}
}
