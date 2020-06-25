package icehs.science.chapter06;

public class BuilldingTest {
	public static void main(String[] args) {
		Building building = new Building();
		building.name = "국제선 타워";
		building.address = "김포동";
		building.totalFloor= 5;
		System.out.println("건물명 : " + building.name);
		System.out.println("주소 : " + building.address);
		System.out.println("전체 층 수 : " + building.totalFloor);
		building.moveElevator();
		building.changeAddress("비행로");
		System.out.println("새주소 : " + building.address);
	}
}
