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

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\n ::MAGAZINE:: " +
				"\n Title: " + getTittle() +
				"\n Editorial: " + getEditorial() +
				"\n Edition Date: " + getEditiondate();
	}

	

}
