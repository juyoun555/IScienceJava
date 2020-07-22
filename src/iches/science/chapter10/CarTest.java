package iches.science.chapter10;

public class CarTest {
	public static void main(String[] args) {
		
	Car[] cars = {
			new Taxi(),
			new Truck()
	};
	cars[0].go(10);
	cars[0].setOilSize(10);
	((Taxi)cars[0]).setMaxNum(4);
	cars[1].go(10);
	cars[1].setOilSize(10);
	((Truck)cars[1]).setMaxWeight(100);
	
	System.out.println();
	Washer car = new Car();
	car.wash();
	System.out.println("택시:");
	cars[0].wash();
	System.out.println("트럭:");
	cars[1].wash();
	}
}
