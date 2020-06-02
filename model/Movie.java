package mx.com.titaniumsolutions.Amazon_Vewer.model;



public class Movie {
	private int id;
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeviewed;
	
	
	public Movie(String title, String genre, String creator, int duration, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
		this.year = year;
	}


	public Movie(String title, String genre, short year) {
		super();
		this.title = title;
		this.genre = genre;
		this.year = year;
	}
	
	public void showData() {
		
		System.out.println("Tittle:" + title );
		System.out.println("Genre:" + genre );
		System.out.println("Year:" + year  );
		
		
	}
	
	public String getTitle() {
		return title; 
		
	}
	
	public void setTitle(String title) {
		this.title = title; 
		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getCreator() {
		return creator;
	}


	public void setCreator(String creator) {
		this.creator = creator;
	}


	public int getDuration() {
		return duration;
	}


	public void setDuration(int duration) {
		this.duration = duration;
	}


	public short getYear() {
		return year;
	}


	public void setYear(short year) {
		this.year = year;
	}


	public boolean isViewed() {
		return viewed;
	}


	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}


	public int getTimeviewed() {
		return timeviewed;
	}


	public void setTimeviewed(int timeviewed) {
		this.timeviewed = timeviewed;
	}
	
	
	
	
	
	
	
	

}
