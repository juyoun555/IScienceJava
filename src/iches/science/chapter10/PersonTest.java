package iches.science.chapter10;

public class PersonTest {
	public static void main(String[] args) {
		Person[] persons = {
				new Person (),
				new Student(),
				new Teacher()
		};
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
			if(p instanceof Student) {
				((Student)p).study();  //��Ʃ��Ʈ�� �޽�带 ������ �� �� ����
			}else if(p instanceof Teacher) {
				((Teacher)p).teach();
			}
			System.out.println();
		}
	}
}
