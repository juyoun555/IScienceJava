package icehs.science.chapte04;

public class SalaryTest {
	public static void main(String[] args) {
		int monthSalary = 1000000;
		int yearSalary = 12*monthSalary;
		int bonus = (int)(monthSalary*0.2*4);
		int incomeAfterTax = yearSalary - (int)(yearSalary*0.1);
		int bonusAfterTax = bonus - (int)(bonus*0.05);
		int overallIncome = incomeAfterTax + bonusAfterTax;
		System.out.println("연봉 : " + yearSalary + " 세후연봉 : " + incomeAfterTax);
		System.out.println("보너스 : " + bonus + " 세후 보너스 : " + bonusAfterTax);
		System.out.println("지급액 : " + overallIncome);
		
		
	}
}
