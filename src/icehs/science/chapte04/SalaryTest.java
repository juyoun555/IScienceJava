package icehs.science.chapte04;

public class SalaryTest {
	public static void main(String[] args) {
		int monthSalary = 1000000;
		int yearSalary = 12*monthSalary;
		int bonus = (int)(monthSalary*0.2*4);
		int incomeAfterTax = yearSalary - (int)(yearSalary*0.1);
		int bonusAfterTax = bonus - (int)(bonus*0.05);
		int overallIncome = incomeAfterTax + bonusAfterTax;
		System.out.println("���� : " + yearSalary + " ���Ŀ��� : " + incomeAfterTax);
		System.out.println("���ʽ� : " + bonus + " ���� ���ʽ� : " + bonusAfterTax);
		System.out.println("���޾� : " + overallIncome);
		
		
	}
}
