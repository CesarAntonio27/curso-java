package mx.com.titaniumsolutions.Amazon_Vewer.model;

public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private Chapter[] chapters;
	

	public Serie(String title, String genre, String creator, int sesssionQuatity){
		super(title, genre, creator, sesssionQuatity);
		// TODO Auto-generated constructor stub
		
		
	}


	public int getId() {
		return id;
	}


	public int getSessionQuantity() {
		return sessionQuantity;
	}


	public void setSessionQuantity(int sessionQuantity) {
		this.sessionQuantity = sessionQuantity;
	}


	public Chapter[] getChapters() {
		return chapters;
	}


	public void setChapters(Chapter[] chapters) {
		this.chapters = chapters;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "::SERIE::" +
				"\n Title: " + getTitle() +
				"\n Genre: " + getGenre() +
				"\n Creator: " + getCreator() +
				"\n sessionQuantity: " + getSessionQuantity();
		
		
	}
	
	//chapters[]
	
	

}
