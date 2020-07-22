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
		String result = "제목 : " + this.title + ", 감독 : " + this.directer + ", 장르 : " + this.genre;
		return result;
	}
}
