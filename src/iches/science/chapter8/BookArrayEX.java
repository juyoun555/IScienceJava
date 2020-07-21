package iches.science.chapter8;

public class BookArrayEX {
	public static void main(String[] args) {
	Book[] books = {new Book("습관의 힘", 16000),new Book("빅 피처", 12000),new Book("7년 후", 13500)};
	for(Book book : books) {
		System.out.println(book.getTitle() + " : " + book.getPrice());
	}
	}
}
