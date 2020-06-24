package ch03;

public class StatisticsCastingTest {

	public static void main(String[] args) {
		double lottoProbability = 0.0000001235;
		long population = 6973738433L;
		System.out.println("로또에 당첨될 확률:"+lottoProbability);
		int intLottoProbability = (int) lottoProbability;
		System.out.println("로또에당첨될 확률 int 변환 :" + intLottoProbability);
		System.out.println("전세계 인구 수 : " + population);
		int intPopulation = (int)population;
		System.out.println("전세계인구 수 int 변환:"+ intPopulation);
	}

}
