package iches.science.chapter05;

public class MySwitchCaseBreak {
	public static void main(String[] args) {
		int x = 5;
		switch(x) {
		case 0:
			System.out.println("0을 입력했습니다.");
			break;
		case 1: // 콜론은 앞에 있는게 라벨이라는 뜻
			System.out.println("1을 입력했습니다.");
			break;
		case 2:
			System.out.println("2을 입력했습니다.");
			break;
		case 3:
			System.out.println("3을 입력했습니다.");
			break;
		case 4:
			System.out.println("4을 입력했습니다.");
			break;
		case 5:
			System.out.println("5을 입력했습니다.");
			break;
		case 6:
			System.out.println("6을 입력했습니다.");
			break;
		case 7:
			System.out.println("7을 입력했습니다.");
			break;
		case 8:
			System.out.println("8을 입력했습니다.");
			break;
		case 9:
			System.out.println("9을 입력했습니다.");
			break;
		default:
			System.out.println("0~9에서 벗어난 수 입력했습니다.");
			break;
		}
	}
}
