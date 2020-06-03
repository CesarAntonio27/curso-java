package mx.com.titaniumsolutions.Amazon_Vewer.model;



public class Movie extends Film {
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
	
	
	
	
	
	
	
	

}
