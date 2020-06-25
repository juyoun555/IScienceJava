package iches.science.chapter05;

public class SwitchCaseTest {
	public static void main(String[] args) {
		int first = 10;
		int second = 20;
		int third = 40;
		int forth = 50;
		int fifth = 80;
		double score =(double)first*second/2*0.6 + (third+forth)/2*0.13 + fifth*0.27;
		int intscore= 100;
		System.out.println("평가 점수 : " + score);
		switch(intscore/10){
		case 10:
		case 9:
			System.out.println("Special Class입니다.");break;
		case 8:
			System.out.println("Gold Class입니다.");break;
		case 7:
			System.out.println("Silver Class입니다.");break;
		case 6:
			System.out.println("Bronze Class입니다.");break;
		default:
			System.out.println("Member 입니다.");break;
		}
		
		if( score>=95 && score<=100);
		else if( score>=95 && score<=100) System.out.println("Special Class입니다!!");
		else if( score>=90 && score<95)System.out.println("Gold Class입니다!!");
		else if( score>=85 && score<90)System.out.println("Silver Class입니다!!");
		else if( score>=80 && score<85)System.out.println("Bronze Class입니다!!");
		else if( score>=0 && score<80)System.out.println("Member입니다!!");
		else System.out.println("점수없엉ㅠㅠ");
	}
}
