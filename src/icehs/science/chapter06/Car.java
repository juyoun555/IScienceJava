package icehs.science.chapter06;

public class Car { 
	int oilAmount;
	double allDistance;
	void printCarInfo() {
		System.out.println("[ICE ī~] ���� �⸧�� : " + this.oilAmount 
				+ "L, �� ����Ÿ� : " + this.allDistance + "km");
	}
	void addOil(int oil) {
		System.out.println("�ֹ��� " + oil + "L �����մϴ�.");
		this.oilAmount += oil;
	}
	void driveCar(String startPoint, String endPoint, double distance) {
		System.out.println(startPoint + "���� " + endPoint 
				+ "���� " + distance + "km �����Ͽ����ϴ�.");
		this.oilAmount -=/*(double)*/ distance /20;
		this.allDistance += distance;
	}
	void calculateDrivingDist() {
		System.out.println("���� ������ �Ÿ��� ��"+
	(double)(this.oilAmount*20)+"km �Դϴ�.");	
	}
}
