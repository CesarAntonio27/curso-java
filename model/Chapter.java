package mx.com.titaniumsolutions.Amazon_Vewer.model;

public class Chapter extends Movie{
	
	
	private int id;
	private int sessionnumber;
	
	public Chapter(String title, String genre, String creator, int duration, short year, int sessionnumber) {
		super(title, genre, creator, duration, year);
		// TODO Auto-generated constructor stub
		this.setSessionnumber(sessionnumber);
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
		return "\n Title: " + getTitle() +
				"\n Session Number: " + getSessionnumber() +
				"\n Duration: " + getDuration();
		
		
	}

}
