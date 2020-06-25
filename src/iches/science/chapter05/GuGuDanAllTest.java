package iches.science.chapter05;

public class GuGuDanAllTest {
	public static void main(String[] args) {
		for(int dan =2; dan<=9 ; dan++) {
			/*if(dan==5){
			 *  continue;
			 *  }
			 */
				for(int i = 1;i<=9; i++) {
					if(i==5) continue;
					System.out.print(dan + "*" + i +"=" +(i*dan) + "\t ");
				}
				System.out.println();
			
		}
	}
}
