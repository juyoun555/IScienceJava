package icehs.science.chapter06;

public class Car { 
	int oilAmount;
	double allDistance;
	void printCarInfo() {
		System.out.println("[ICE 카~] 남은 기름양 : " + this.oilAmount 
				+ "L, 총 주행거리 : " + this.allDistance + "km");
	}
	void addOil(int oil) {
		System.out.println("휘발유 " + oil + "L 주유합니다.");
		this.oilAmount += oil;
	}
	void driveCar(String startPoint, String endPoint, double distance) {
		System.out.println(startPoint + "에서 " + endPoint 
				+ "까지 " + distance + "km 주행하였습니다.");
		this.oilAmount -=/*(double)*/ distance /20;
		this.allDistance += distance;
	}
	void calculateDrivingDist() {
		System.out.println("주행 가능한 거리는 약"+
	(double)(this.oilAmount*20)+"km 입니다.");	
	}
}
