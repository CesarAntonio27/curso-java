package mx.com.titaniumsolutions.Amazon_Vewer;

import mx.com.titaniumsolutions.Amazon_Vewer.model.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Movie movie = new Movie();
		movie.tittle = "coco";
		movie.timeviewed = 120;

		int exit = 0;
		
		do {
			System.out.println("BIENVENIDOS A AMAZON VIEWER");
			System.out.println("");
			System.out.println("selecciona el número de la opción deseada: ");
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			
			byte opcion = 5;
			switch (opcion) {
			case 1: 
				System.out.println("lista de movies:");
				break;
			case 2: 
				System.out.println("lista de series:");
				break;
			case 3: 
				System.out.println("lista de books:");
				break;
			case 4: 
				System.out.println("lista de magazines:");
				break;
			case 0: 
				System.out.println("gracias por usar Amazon VIewer ");
				break;
			default:
				System.out.println("opcion invalida");
				break; 
			
				
			}
			
		} while (exit != 0);
		
		

	}

}
