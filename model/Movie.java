package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Movie extends Film implements IVisualisable {
	private int id;
	private int timeviewed;
	
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super(title, genre, creator, duration);
		setYear(year);
	}




	public void showData() {
		
		/*System.out.println("Tittle:" + title );
		System.out.println("Genre:" + genre );
		System.out.println("Year:" + year  );*/
		
		
	}
	



	public int getId() {
		return id;
	}
	public int getTimeviewed() {
		return timeviewed;
	}


	public void setTimeviewed(int timeviewed) {
		this.timeviewed = timeviewed;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "\n ::MOVIE::" +
				"\n Title: " + getTitle() +
				"\n Genre: " + getGenre() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
		
		
	}




	@Override
	public Date starTosee(Date dateI) {
		// TODO Auto-generated method stub
		
		return dateI;
	}




	@Override
	public void stoopTosee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimeviewed(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimeviewed(0);
		}
		 
	}
	
	
	public static ArrayList<Movie> makemovieslist (){
		
		ArrayList<Movie>  movies = new ArrayList();

		//creando movies con un bucle para ahorrar memoria 
		for (int i = 1; i <= 5; i++) {
			movies.add(new Movie("movie: " + i,"genero: " + i, "creador: " + i, 120+i,(short)(2020+i)));
		}
		
		
		return movies;
		
	}
	
	
	
	

}
