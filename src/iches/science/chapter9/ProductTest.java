package iches.science.chapter9;

public class ProductTest {
	public static void main(String[] args) {
		Product pro1 = new Product("�뵹��",450000,8);
		Television pro2 = new Television("�ó׸�TV",3500000,10,"ȭ��ũ�� 151cm");
		
		System.out.println("========��ǰ����========");
		pro1.printProductInfo();
		System.out.println("-------------------");
		pro2.printProductInfo();
		System.out.println("��� : " + pro2.getDescription());
		System.out.println("[����] �������� ��� 15%�� �����մϴ�.");
		pro1.setDiscount(15);
		pro2.setDiscount(15);
		System.out.println(pro1.getName() + "�ǸŰ� : " + pro1.calculateDiscountPrice());
		System.out.println(pro2.getName() + "�ǸŰ� : " + pro2.calculateDiscountPrice());
	}
}
