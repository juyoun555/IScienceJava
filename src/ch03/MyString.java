package ch03;

public class MyString {
	public static void main(String[] args) {
		String name ="ȫ�浿";
		String lee = "�̼���";
		String we=name+lee;
		String strAge = "23";
		int age = Integer.parseInt(strAge);
		System.out.println("�������� �ٹ��� ���� �� ����� : " + name + "," + lee);
		System.out.println("��ü�� ��� : "+we);
		System.out.println("������ ���� ���� : " + (age + 1));		
	}
}
