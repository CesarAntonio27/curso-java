package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.ArrayList;
import java.util.Date;

public class Serie extends Film{
	
	private int id;
	private int sessionQuantity;
	private ArrayList<Chapter> Chapters;
	

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


	public ArrayList<Chapter> getChapters() {
		return Chapters;
	}


	public void setChapters(ArrayList<Chapter> chapters) {
		this.Chapters = chapters;
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
	
	
	
	public static ArrayList<Serie> makeserielist (){
		
		ArrayList<Serie>  series = new ArrayList<Serie>();

		//creando movies con un bucle para ahorrar memoria 
		for (int i = 1; i <= 5; i++) {
			
			series.add(new Serie("serie" + i, "suspenso", "creador:" + i, i));
		}
		
		
		return series;
		
	}
	
	
	//chapters[]
	
	

}
