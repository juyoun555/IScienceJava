package iches.science.chapter9;

public class Movie {
	private String title;
	private String directer;
	private String genre;
	public Movie(String title, String directer, String genre) {
		this.title = title;
		this.directer = directer;
		this.genre = genre;
	}
	@Override
	public String toString(){
		String result = "���� : " + this.title + ", ���� : " + this.directer + ", �帣 : " + this.genre;
		return result;
	}
}
