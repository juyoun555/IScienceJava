package iches.science.chapter8;

public class ScoreArrayTest {
	public static void main(String[] args) {
		int[] scores = {93,87,90};
		String[] subject = {"����","����","����"};
		int sum = 0;
		double avg = 0;
		for(int i =0; i< subject.length; i++ ) {
			System.out.println(subject[i] + " : "+ scores[i]);
			sum+= scores[i];
		}
		avg = (double)sum / scores.length;
		System.out.println("��� : " + avg);
	}
}
