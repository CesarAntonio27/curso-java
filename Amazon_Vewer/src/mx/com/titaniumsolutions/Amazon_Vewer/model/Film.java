package mx.com.titaniumsolutions.Amazon_Vewer.model;

public class Film {
	
	private String title;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	
	
	
	
	public Film(String title, String genre, String creator, int duration) {
		super();
		this.title = title;
		this.genre = genre;
		this.creator = creator;
		this.duration = duration;
	}

	
	public String getTitle() {
		return title;
	}
	



	public void setTitle(String title) {
		this.title = title;
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
	//validando si la respuesta de si fue visto, respondiendo si o no
	public String isViewed() {
		
		String visto = "";
		if(viewed == true) {
			visto = "si";
		}else {
			visto= "No";
		}
		
		return visto;
	}
	public void setViewed(boolean viewed) {
		this.viewed = viewed;
	}
	
	
	public boolean getisviewed() {
		return viewed;
	}
	
	
	

}
