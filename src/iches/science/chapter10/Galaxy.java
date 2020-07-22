package iches.science.chapter10;

public class Galaxy extends Mobile implements Cooplay{
	private String osVersion;
	public Galaxy() {
		super("Galaxy");
	}
	
	public String getOsVersion() {
		return osVersion;
	}

	public void setOsVersion(String osVersion) {
		this.osVersion = osVersion;
		System.out.println("Galaxy : " + osVersion);
	}

	@Override
	public void charge(int time) {
		System.out.println("Galaxy : �������͸�" + time + "�� ����.");
	}
	public void buy(String kind, int price) {
		System.out.println("Galaxy : " + kind + "����" + price + "�� �����Ͽ����ϴ�.");
	}
}
