package iches.science.chapter8;

public class AccountCalculatorTest {
	public static void main(String[] args) {
		Account[] accArray = new Account[5];
		for(int i = 0 ; i < accArray.length ; i++) {
			accArray[i] = new Account("111-2222-555" + (i+1),10000*(i+1), 45/1000);
			System.out.println("���¹�ȣ : " + accArray[i].getNumbers() + "/�ܾ� : " + accArray[i].getBalance() + "�� / ���� : " + accArray[i].getInterestRate()*100+"%");
		}
		System.out.println("������ �����մϴ�.");
		for(Account acc:accArray) {
			acc.setInterestRate(3.7);
			System.out.println("���¹�ȣ:" + acc.getNumbers() + "/���� :" + acc.getInterestRate() +"% / �ܾ� : "+(acc.getBalance()+ acc.caculateInterest()));
		}
	}
}
