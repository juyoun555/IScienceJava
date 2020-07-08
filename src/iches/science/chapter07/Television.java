package iches.science.chapter07;

public class Television {
	String name;
	int price;
	String description;
	public Television(String name, int price, String description) {
		this.name = name;
		this.price = price;
		this.description = description;
	}
	public Television(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	void printTelevisionInfo() {
		if(this.description == null) {
		System.out.println( this.name + " : " + this.price);
		}else {
			System.out.println( this.name + "(" + this.description +") : " + this.price);
		}
	}
	
}
