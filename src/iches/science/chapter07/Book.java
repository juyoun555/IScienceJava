package iches.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	Book(){
		
	}
	Book(String title, int price){         //2번으로 호출됨
		this(title);     		//book(String title)에 넣는 것과 동일
		this.price = price;
	}
	
	Book(String title, String author, int price){    //3번으로 호출됨
		this(title, price);
		this.author = author;
	}
	Book(String title){                  //1번 호출됨
		this.title = title;
	}
	void printBookInfo() {
		System.out.println(title);
		System.out.println(price);
	}
	
	
}
