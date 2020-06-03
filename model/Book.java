package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.Date;

public class Book extends Publication implements IVisualisable {
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String detailBook = "\n ::BOOK:: " +
		                    "\n Title: " + getTittle() +
		                    "\n Editorial: " + getEditorial() +
		                    "\n Edition Date: " + getEditiondate() +
		                    "\n Authors: " ;
		for (int i = 0; i < getAuthors().length; i++) {
			detailBook += "\t" + getAuthors()[i];
		}
		return detailBook;
	}




	@Override
	public Date starTosee(Date dateI) {
		// TODO Auto-generated method stub
		return dateI;
	}




	@Override
	public void stoopTosee(Date dateI, Date dateF) {
		// TODO Auto-generated method stub
		if (dateF.getSeconds() > dateI.getSeconds()) {
			setTimereaded(dateF.getSeconds() - dateI.getSeconds());
		}else {
			setTimereaded(0);
		}
	}
}
