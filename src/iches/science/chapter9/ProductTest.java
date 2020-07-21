package iches.science.chapter9;

public class ProductTest {
	public static void main(String[] args) {
		Product pro1 = new Product("통돌이",450000,8);
		Television pro2 = new Television("시네마TV",3500000,10,"화면크기 151cm");
		
		System.out.println("========제품정보========");
		pro1.printProductInfo();
		System.out.println("-------------------");
		pro2.printProductInfo();
		System.out.println("비고 : " + pro2.getDescription());
		System.out.println("[공지] 할인율을 모두 15%로 변경합니다.");
		pro1.setDiscount(15);
		pro2.setDiscount(15);
		System.out.println(pro1.getName() + "판매가 : " + pro1.calculateDiscountPrice());
		System.out.println(pro2.getName() + "판매가 : " + pro2.calculateDiscountPrice());
	}
}
