package iches.science.chapter07;

public class Movie {
	String title;
	String director;
	String genre;
	
	Movie(){
		
	}
	
	Movie(String title, String director){
		this.director = director;
		this.title = title;
	}
	
	Movie(String title, String director, String genre){
		this.director = director;
		this.title = title;
		this.genre = genre;
	}

}
