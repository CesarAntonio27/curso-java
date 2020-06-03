package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.Date;

public class Book extends Publication {
	private int id;
	private String isbn;
	private boolean readed;
	private int timereaded;
	
	
	
	public Book(String tittle, Date editiondate, String editorial, String isbn) {
		super(tittle, editiondate, editorial);
		this.isbn = isbn;
	}
	



	public int getId() {
		return id;
	}



	public String getIsbn() {
		return isbn;
	}



	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}



	public boolean isReaded() {
		return readed;
	}



	public void setReaded(boolean readed) {
		this.readed = readed;
	}



	public int getTimereaded() {
		return timereaded;
	}



	public void setTimereaded(int timereaded) {
		this.timereaded = timereaded;
	}
	
	
}
