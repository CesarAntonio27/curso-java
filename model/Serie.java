package mx.com.titaniumsolutions.Amazon_Vewer.model;

public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private Chapter[] chapter;
	

	public Serie(String title, String genre, String creator, int duration, int sesssionQuatity){
		super(title, genre, creator, duration);
		this.sessionQuantity = sesssionQuatity;
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	
	//chapters[]
	
	

}
