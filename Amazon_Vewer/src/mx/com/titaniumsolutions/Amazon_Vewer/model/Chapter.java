package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.ArrayList;

public class Chapter extends Movie{
	
	
	private int id;
	private int sessionnumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionnumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionnumber(sessionnumber);
	}
	
	@Override
	public int getId() {
		// TODO Auto-generated method stub
		return this.id;
	}

	public int getSessionnumber() {
		return sessionnumber;
	}

	public void setSessionnumber(int sessionnumber) {
		this.sessionnumber = sessionnumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "::CHAPTER::" +
				"\n Title: " + getTitle() +
				"\n Year: " + getYear() +
				"\n Creator: " + getCreator() +
				"\n Duration: " + getDuration();
		
		
	}
	
	
public static ArrayList<Chapter> makechapterlist (){
		
		ArrayList<Chapter>  chapters = new ArrayList<Chapter>();

		//creando chapters con un bucle para ahorrar memoria 
		for (int i = 1; i <= 5; i++) {
			
			chapters.add(new Chapter("capitulo: "+i, "suspenso: " + i, "cesar", 40+i, (short)(2019+i), 1));
		}
		
		
		return chapters;
		
	}
	
	
	

}
