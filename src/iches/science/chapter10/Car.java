package iches.science.chapter10;

public class Car implements Washer {
	private int OilSize;

	public int getOilSize() {
		return OilSize;
	}

	public void setOilSize(int oilSize) {
		OilSize = oilSize;
		System.out.println("���� : " + this.OilSize);
	}
	
	public void go(int distance) {
		System.out.println(distance + "km �̵��մϴ�.");
	}

	@Override
	public void wash() {
		System.out.println("�����մϴ�.");
		
	}
}
