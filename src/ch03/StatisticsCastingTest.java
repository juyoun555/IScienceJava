package ch03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		System.out.println("�ζǿ� ��÷�� Ȯ��:"+lottoProbability);
		int intLottoProbability = (int) lottoProbability;
		System.out.println("�ζǿ���÷�� Ȯ�� int ��ȯ :" + intLottoProbability);
		System.out.println("������ �α� �� : " + population);
		int intPopulation = (int)population;
		System.out.println("�������α� �� int ��ȯ:"+ intPopulation);
	}

}
