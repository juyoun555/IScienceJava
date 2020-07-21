package iches.science.chapter8;

public class ChocolateArrayTest {
	public static void main(String[] args) {
		Chocolate[] chocos = {
				new Chocolate("�Ƹ�����","��ũ",2200),
				new Chocolate("Ű����","��ũ",2500),
				new Chocolate("Ʈ���� ���","ȭ��Ʈ",2300),
		};
		int totalPrice = 0;
		for(Chocolate choco : chocos ) {
			choco.printChocolateInfo();
			
			if(choco.getType().equals("ȭ��Ʈ")) {//eqauls �ƴ��� ��Ʈ���� ������
				choco.setPrice(choco.getPrice()*8/10);
			}
			totalPrice += choco.getPrice();
		}
		System.out.println("�ϳ��� �������� �� �� ���� : " + totalPrice);
		System.out.println();
		for(int i =0;i< chocos.length; i++) {
			chocos[i].printChocolateInfo();
			
		}
	}
}
