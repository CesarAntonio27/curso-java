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
    
	
	
}
