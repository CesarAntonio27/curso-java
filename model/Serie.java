package mx.com.titaniumsolutions.Amazon_Vewer.model;

public class Serie {
	private int id;
	private String tittle;
	private String genre;
	private String creator;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeviewed;
	
	private int sessionquantity;

	public Serie(String tittle, String genre, int duration) {
		super();
		this.tittle = tittle;
		this.genre = genre;
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTittle() {
		return tittle;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
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

	public int getSessionquantity() {
		return sessionquantity;
	}

	public void setSessionquantity(int sessionquantity) {
		this.sessionquantity = sessionquantity;
	}
	
	//chapters[]
	
	

}
