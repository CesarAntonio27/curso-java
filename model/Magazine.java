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
	
	

}
