package iches.science.chapter07;


public class Publication {
	static int numOfInstance =5;
	private String title;
	private int price;
	private int page;
	
	Publication(){
		numOfInstance++;    //호출될 떄마다 발동이된다.
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
			System.out.println("[에러] 가격정보는 음수를 입력할 수 없습니다!!");
		}else {
		this.price = price;
	
		}
	}
	
	public int getPage() {
		return this.page;
	}
	
	public void setPage(int page) {
		if(page < 0) {
			System.out.println("[에러] 페이지 정보는 음수를 입력할 수 없습니다!!");
		}else {
		this.page = page;
		}
	}
}
