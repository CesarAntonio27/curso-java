package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.Date;

public class Book {
	private int id;
	private String tittle;
	private Date editiondate;
	private String editorial;
	private String[] authors;
	private String isbn;
	private boolean readed;
	private int timereaded;
	public Book(String tittle, Date editiondate, String editorial, String isbn) {
		super();
		this.tittle = tittle;
		this.editiondate = editiondate;
		this.editorial = editorial;
		this.isbn = isbn;
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
	public Date getEditiondate() {
		return editiondate;
	}
	public void setEditiondate(Date editiondate) {
		this.editiondate = editiondate;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public String[] getAuthors() {
		return authors;
	}
	public void setAuthors(String[] authors) {
		this.authors = authors;
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
