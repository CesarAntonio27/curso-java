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
	
	//chapters[]
	
	

}
