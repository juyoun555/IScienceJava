package iches.science.chapter10;

public class Truck extends Car{
	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
		System.out.println("Ʈ�� �ִ� ������ : " + maxWeight + "kg");
	}
	@Override
	public void go(int distance) {
		System.out.println("Ʈ���� Ÿ��" + distance + "km �̵��մϴ�.");
	}
}
