package iches.science.chapter10;

public class SpiderMan extends Class {
	@Override
	public void action(){
		this.swim();
		this.fight();
		this.fly();
	}
	
	@Override
	public String toString() {
		return "스파이더맨";
	}
}
