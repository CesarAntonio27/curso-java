package mx.com.titaniumsolutions.HolaMundo;

public class ArreglosCursoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//arrays
		//declaracions de array / el "= new int []" define el tamaño del arreglo
		int[] arregloInt = new int [3];//tiene 3 espacios
		//otra forma de declarar un array / el "= new double []" define el tamaño del arreglo
		double arregloDouble[] = new double [3];//tiene 3 espacios
		
		//definiendo un arrey de dos dimanesiones / el "= new int [][]" define el tamaño del arreglo
		int [][] arrey2D = new int [2][3];//tiene 6 espacios
		
		
		//definiendo arrey de tres dimensiones/ el "= new int [][][]" define el tamaño del arreglo
		
		int [][][] arrey3D = new int [3][3][2];//tiene 18 espacios
		
		//definiendo un arreglo 2D con char / el "= { {}, {} };" 
		char[][] days = { {'M','T','W'}, {'M','T','W'} };
		
		//definiendo arreglo y asigno valores con indices 
		char[] names = new char [4];
		names[0] = 'h';
		names[1] = 'o';
		names[2] = 'l';
		names[3] = 'a';
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		System.out.println("encontrando a monkey");
		//creando un arreglo de 4 dimensiones 
		char[][][][] monkey = new char [2][3][2][2];
		
		//encontrando un elemento dentro de un arreglo con su indice
		monkey [1][0][0][1] = 'm';
		System.out.println(monkey [1][0][0][1]);
		
		
		
		
	}

}
