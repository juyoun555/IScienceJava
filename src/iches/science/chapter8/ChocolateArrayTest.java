package iches.science.chapter8;

public class ChocolateArrayTest {
	public static void main(String[] args) {
		Chocolate[] chocos = {
				new Chocolate("아마도라","다크",2200),
				new Chocolate("키리쉬","다크",2500),
				new Chocolate("트리플 블랑","화이트",2300),
		};
		int totalPrice = 0;
		for(Chocolate choco : chocos ) {
			choco.printChocolateInfo();
			
			if(choco.getType().equals("화이트")) {//eqauls 아느이 스트링과 같으면
				choco.setPrice(choco.getPrice()*8/10);
			}
			totalPrice += choco.getPrice();
		}
		System.out.println("하나씩 구매했을 때 총 가격 : " + totalPrice);
		System.out.println();
		for(int i =0;i< chocos.length; i++) {
			chocos[i].printChocolateInfo();
			
		}
	}
}
