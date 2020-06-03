package mx.com.titaniumsolutions.Amazon_Vewer.model;

import java.util.Date;

public class Magazine extends Publication {
	private int id;
	
	
	
	public Magazine(String tittle, Date editiondate, String editorial) {
		super(tittle, editiondate, editorial);
		// TODO Auto-generated constructor stub
	}
	
	public int getId() {
		return id;
	}
	
	
	public void setId() {
		this.id = id;
	}

	

}
