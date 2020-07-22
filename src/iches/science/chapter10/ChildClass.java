package iches.science.chapter10;

public class ChildClass extends SuperClass implements InterfaceOne, InterfaceTwo {
	@Override
	public voi methodTwo() {
		System.out.println("Method Two 구현");
	}
	
	@Override
	public void methodOne() {
		System.out.println("Method One 구현");
	}//인터페이스로 다중상속가능, 
}
