package iches.science.chapter8;

public class BookArrayEX {
	public static void main(String[] args) {
	Book[] books = {new Book("������ ��", 16000),new Book("�� ��ó", 12000),new Book("7�� ��", 13500)};
	for(Book book : books) {
		System.out.println(book.getTitle() + " : " + book.getPrice());
	}
	}
}
