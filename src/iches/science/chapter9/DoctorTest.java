package iches.science.chapter9;

public class DoctorTest {
	public static void main(String[] args) {
		Dentist dent = new Dentist("ȫ�浿");
		System.out.println(dent.getDepartment() + " : " + dent.getName());
		dent.treatPatient();
		dent.pullOutTooth();
	}
}
