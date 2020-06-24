package ch03;

public class TypeCasting {
	public static void main(String[] args) {
		long billWealth = 70000000000L;
		System.out.println("Original Value : " + billWealth);
		double doubleBillWealth = billWealth;
		System.out.println("double 형으로 형변환 :"+ doubleBillWealth);
		int intBillWealth = (int)billWealth;//변환하고 싶은 형태를 앞에다 관호로 넣어줌 ==>> 강제 변환
		System.out.println("int형으로 강제 형변환:" + intBillWealth);
	}
}
