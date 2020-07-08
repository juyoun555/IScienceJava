package iches.science.chapter07;

public class Student {
	private String name;
	private int grade;
	
	public void setName(String name) {   //맴버변수의 설정 부분에는 set이라 씀 세터메소드(setter method)라 한뎅
		this.name = name;
	}
	
	public void setGrade(int grade) {
		if(grade>3 || grade <0) {
			System.out.println("학년을 잘못 입력하였습니다.");
		}else {
			this.grade = grade;
		}
	}
	
	public String getName() {     // 리턴타입은 동일한 타입을 가져옴, get을 붙여 그 값을 가져옴 gettermethod 라고함
		return this.name;
	}
	
	public int getGrade() {
		return this.grade;
	}
	
}
