package iches.science.chapter10;

public class AccountTest {
	public static void main(String[] args) {
		Account[] fundAcc = {
				new Account("1313-445566","����ġ",100000),
				new FundAccount("111-2222","ȫ�浿",5000000,5.6),
				new FundAccount("666-7777","ȫ���",1000000,2.9)
		};
		for(Account acc : fundAcc) {
			System.out.println(acc);
			System.out.println();
		}
	}
}
