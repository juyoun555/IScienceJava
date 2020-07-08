package iches.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	Book(){
		
	}
	Book(String title, int price){         //2������ ȣ���
		this(title);     		//book(String title)�� �ִ� �Ͱ� ����
		this.price = price;
	}
	
	Book(String title, String author, int price){    //3������ ȣ���
		this(title, price);
		this.author = author;
	}
	Book(String title){                  //1�� ȣ���
		this.title = title;
	}
	void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
	}
	
	
}
