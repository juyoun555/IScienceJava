package icehs.science.chapter06;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.oilAmount = 5;
		myCar.allDistance = 140;
		myCar.printCarInfo();
		myCar.addOil(10);
		myCar.printCarInfo();
		myCar.driveCar("IT센터", "인천공항", 10.17);
		myCar.printCarInfo();
		myCar.driveCar("인천공항", "곤지안리조트", 60.21);
		myCar.printCarInfo();
		myCar.calculateDrivingDist();
	}
}
