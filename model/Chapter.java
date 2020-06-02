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
	
	

}
