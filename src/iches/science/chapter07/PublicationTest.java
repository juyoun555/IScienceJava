package iches.science.chapter07;

public class PublicationTest {
	public static void main(String[] args) {
		Publication pub1 = new Publication();
		System.out.println(pub1.numOfInstance);
		Publication pub2 = new Publication();
		System.out.println(pub2.numOfInstance);
		pub2.numOfInstance++;
		System.out.println(pub1.numOfInstance);
		System.out.println(pub2.numOfInstance);
		System.out.println(Publication.numOfInstance);  //static 만 가능하다
		System.out.println("=====출판물 정보를 세팅합니다.=====");
		pub1.setPrice(-1000);
		pub1.setPage(-1);
		pub1.setTitle("만화삼국지");
		pub1.setPage(300);
		pub1.setPrice(5000);
		
		System.out.println("출판문 정보 : " + pub1.getTitle() + " ( " + pub1.getPrice() + " 원, " + pub1.getPage() + " page )" );
	}
}
