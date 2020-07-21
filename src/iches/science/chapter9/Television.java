package iches.science.chapter9;

public class Television extends Product {
	private String description;

	public Television(String name, int price, int discount,String description) {
		super(name, price, discount);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
