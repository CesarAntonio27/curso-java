package mx.com.titaniumsolutions.Amazon_Vewer.model;

public class Chapter {
	private int id;
	private String tittle;
	private int duration;
	private short year;
	private boolean viewed;
	private int timeviewed;
	private int sessionnumber;
	
	public Chapter(String tittle, int duration, short year) {
		super();
		this.tittle = tittle;
		this.duration = duration;
		this.year = year;
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

	public int getSessionnumber() {
		return sessionnumber;
	}

	public void setSessionnumber(int sessionnumber) {
		this.sessionnumber = sessionnumber;
	}
	
	

}
