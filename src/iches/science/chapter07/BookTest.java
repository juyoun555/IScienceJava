package iches.science.chapter07;

public class BookTest {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "과학과 사상";
		book1.price = 25000;
		book1.printBookInfo();
		
		Book book2 = new Book("해리포터", 18000);
		book2.printBookInfo();
		
		Book book3 = new Book("Office 365 in school");
		book3.printBookInfo();
	}
}
