package iches.science.chapter07;


public class Publication {
	static int numOfInstance =5;
	private String title;
	private int price;
	private int page;
	
	Publication(){
		numOfInstance++;    //ȣ��� ������ �ߵ��̵ȴ�.
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setPrice(int price) {
		if(price < 0 ) {
			System.out.println("[����] ���������� ������ �Է��� �� �����ϴ�!!");
		}else {
		this.price = price;
	
		}
	}
	
	public int getPage() {
		return this.page;
	}
	
	public void setPage(int page) {
		if(page < 0) {
			System.out.println("[����] ������ ������ ������ �Է��� �� �����ϴ�!!");
		}else {
		this.page = page;
		}
	}
}
