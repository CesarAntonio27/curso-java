package mx.com.titaniumsolutions.Amazon_Vewer;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import mx.com.titaninumsolutions.makereport.report;
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
			System.out.println("5.Report");
			System.out.println("6.Report Today");
			System.out.println("0. Exit");
			
			
			//lee la respuesta del usuario en opcion
			Scanner sc = new Scanner(System.in);
			int opcion = Integer.valueOf(sc.nextLine()) ;
			
			switch (opcion) {
			case 0: 
				//salir
				exit = 0;
				
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
			case 5:
				makeReport();;
				break;
			case 6:
				makeRepor(new Date());;
			default:
				System.out.println("");
				System.out.println("....¡¡opcion invalida!!....");
				System.out.println("");
				break; 
			
				
				
			}
			
		} while (exit != 0);
		
	}
	static ArrayList<Movie> movies;
	public static void showMovies() {
		int exit = 1;
		movies = Movie.makemovieslist();
		do {
			System.out.println("");
			System.out.println("::MOVIES::");
			System.out.println("");
			for (int i = 0; i < movies.size(); i++) {//imprimirá: 1.movie 1 visto: si/no
				
				System.out.println(i+1 + "." + movies.get(i).getTitle() + " visto:" + movies.get(i).isViewed());
				
			}
			
			
			System.out.println("0. regresar al Menu");
			System.out.println();
			
			//leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			//opcion que regresa al menu en caso de ser 0
			if(response == 0) {
				showMenu();
			}
			
			
			Movie movieSelected = movies.get(response - 1);
			movieSelected.setViewed(true);
			Date dateI = movieSelected.starTosee(new Date());
			
			for (int i = 0; i < 1000; i++) {
				System.out.println(".................");
				
			}
			
			//termine de verla
			
			movieSelected.stoopTosee(dateI, new Date() );
			System.out.println();
			System.out.println("viste: " + movieSelected);
			System.out.println("por: "+ movieSelected.getTimeviewed() + "milisegundos");
			
			
			
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
	ArrayList<Serie> series = Serie.makeserielist();	
		do {
			System.out.println("");
			System.out.println("::SERIES::");
			System.out.println("");
			
			for (int i = 0; i < series.size(); i++) {//imprimirá: 1.movie 1
				
				System.out.println(i+1 + "." + series.get(i).getTitle() + "  visto:" + series.get(i).isViewed());
				
			}
			
			
			System.out.println("0. regresar al Menu");
			System.out.println();
			
			//leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			//opcion que regresa al menu en caso de ser 0
			if(response == 0) {
				showMenu();
			}else {
				showChapters();
			}
			
		} while (exit != 0);
	}
	
	public static void showChapters() {
	int exit = 0;
	ArrayList<Chapter> chapters = Chapter.makechapterlist(); 	
		do {
			System.out.println("");
			System.out.println("::CHAPTERS::");
			System.out.println("");
			
			
			for (int i = 0; i < chapters.size(); i++) {//imprimirá: 1.chapter 1 visto: si/no
				
				System.out.println(i+1 + "." + chapters.get(i).getTitle() + " visto:" + chapters.get(i).isViewed());
				
			}
			
			
			System.out.println("0. regresar al Menu");
			System.out.println();
			
			//leer respuesta del usuario
			Scanner sc = new Scanner(System.in);
			int response = Integer.valueOf(sc.nextLine());
			//opcion que regresa al menu en caso de ser 0
			if(response == 0) {
				showMenu();
			}
			 
			Chapter chapterSelected = chapters.get(response - 1);
			chapterSelected.setViewed(true);
			Date dateI = chapterSelected.starTosee(new Date());
			
			for (int i = 0; i < 100; i++) {
				System.out.println(".................");
				
			}
			
			//termine de verla
			
			chapterSelected.stoopTosee(dateI, new Date() );
			System.out.println();
			System.out.println("viste: " + chapterSelected);
			System.out.println("por: "+ chapterSelected.getTimeviewed() + "milisegundos");
			
			showChapters();
			
		} while (exit != 0);
	}

	public static void makeReport() {
		
		report report = new report();
		report.setNamefile("reporte");
		report.setExtension("txt");
		report.setTitle("::VISTOS::");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getisviewed()) {
				contentReport += movie.toString() + "\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		
		
		
		
	}
	
	public static void makeRepor(Date date) {
		SimpleDateFormat df = new SimpleDateFormat("yyy-MM-dd");
		
		String dateString = df.format(date);
		
		report report = new report();
		
		report.setNamefile("reporte" + dateString);
		report.setExtension("txt");
		report.setTitle("::VISTOS::");
		String contentReport = "";
		
		for (Movie movie : movies) {
			if (movie.getisviewed()) {
				contentReport += movie.toString() + "\n";
			}
		}
		
		report.setContent(contentReport);
		report.makeReport();
		
	}
	
	
	
	
	
}
