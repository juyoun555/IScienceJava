package iches.science.chapter10;

public class Bird extends Animal implements Flyable {

	private String habitat;

	public Bird(String kind, int age,String habitat) {
		super(kind, age);
		this.habitat = habitat;
		// TODO Auto-generated constructor stub
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}
	@Override
	public void fly() {
		System.out.println("날아간다.");
	}
	@Override
	public void spreadWings() {
		System.out.println("날개를 펼친다.");
	}
	@Override
	public String toString() {
		String result;
		result = this.getKind() + "(" + this.getAge() + "살) :"
		+ this.getHabitat();
		return result;
	}

}
