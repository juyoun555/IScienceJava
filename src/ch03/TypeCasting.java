package ch03;

public class TypeCasting {
	public static void main(String[] args) {
		long billWealth = 70000000000L;
		System.out.println("Original Value : " + billWealth);
		double doubleBillWealth = billWealth;
		System.out.println("double ������ ����ȯ :"+ doubleBillWealth);
		int intBillWealth = (int)billWealth;//��ȯ�ϰ� ���� ���¸� �տ��� ��ȣ�� �־��� ==>> ���� ��ȯ
		System.out.println("int������ ���� ����ȯ:" + intBillWealth);
	}
}
