package mx.com.titaniumsolutions.Amazon_Vewer;

import mx.com.titaniumsolutions.Amazon_Vewer.model.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		showMenu();

		
		
		

	}

	
	
	
	public static void showMenu() {
        
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
			
			int opcion = 0;
			switch (opcion) {
			case 0: 
				//salir
				
				
				break;
			case 1: 
				showMovies();
				break;
			case 2: 
				showSeries();
				break;
			case 3: 
				showBooks();
				break;
			case 4: 
				showMagazines();
				break;
			default:
				System.out.println("");
				System.out.println("....¡¡opcion invalida!!....");
				System.out.println("");
				break; 
			
				
			}
			
		} while (exit != 0);
		
	}
	
	public static void showMovies() {
		int exit = 0;
		
		do {
			System.out.println("");
			System.out.println("::MOVIES::");
			System.out.println("");
			
		} while (exit != 0);
	}
	
	public static void showBooks() {
	int exit = 0;
		
		do {
			System.out.println("");
			System.out.println("::BOOKS::");
			System.out.println("");
			
		} while (exit != 0);
	}
	
	public static void showMagazines() {
	int exit = 0;
		
		do {
			System.out.println("");
			System.out.println("::MAGAZINES::");
			System.out.println("");
			
		} while (exit != 0);
	}
	
	public static void showSeries() {
	int exit = 0;
		
		do {
			System.out.println("");
			System.out.println("::SERIES::");
			System.out.println("");
			
		} while (exit != 0);
	}
	
	public static void showChapters() {
	int exit = 0;
		
		do {
			System.out.println("");
			System.out.println("::CHAPTERS::");
			System.out.println("");
			
		} while (exit != 0);
	}

	
}
