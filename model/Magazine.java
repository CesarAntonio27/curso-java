package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.Date;

public class Magazine {
	
	private int id;
	private String tittle;
	private Date editiondate;
	private String editorial;
	private String[] authors;
	
	public Magazine(String tittle, Date editiondate, String editorial) {
		super();
		this.tittle = tittle;
		this.editiondate = editiondate;
		this.editorial = editorial;
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
	
	

}
