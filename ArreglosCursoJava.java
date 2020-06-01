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
		
		
		//operadores de incremento ++ y decremento --
		//Post Fijo - Pre incremento
		int i = 5;
		System.out.println(++i);
		System.out.println(i);

		//Pre fijo - Post incremento
		int l = 3;
		System.out.println(l++);
		System.out.println(l);
		
		//operadores de equidad
		
		int q = 2;
		int p = 9;
		
		System.out.println(q==p);
		System.out.println(q!=p);
		
		
		int s = 9;
		int r = 9;
		
		System.out.println(r==s);
		System.out.println(r!=s);
		
		//operadores logicos 
		
		boolean n = false;
		boolean m = true;
		
		System.out.println("n && m -> " + (n && m));
		System.out.println("n || m -> " + (n || m));
		System.out.println("!n -> " + (!n));
		System.out.println("!m -> " + (!m));
		
	//control de flujo if/else
		
		if (q > p) {
			//true 
			System.out.println("si es mayor");
		} else {
			//false 
			System.out.println("no es mayor");
		}
		
		//ciclos 
		//bucle while
		int e = 1;
				while (e <= 5 ) {
					System.out.println("e es menor o igual que 5");
					e++;
		};

		//salto de linea 
		System.out.println("");
		
        //bucle for
		int numeros [] = new int[5] ;
		for (int c = 0; c < 5; c++) {
			numeros[c]=  c;
			System.out.println("numeros ["+c+"]: " + numeros [c]);
		}
		
		
		
		//bucle foreach
		for (int j : numeros) {
			System.out.println(j);
					
		}
		//ciclo for anidado
		//Definimos un array de 3 filas x 5 columnas
        int array[][]={{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}};
 
        //Recorremos el array multidimensional
        for (int o=0;o<array.length;o++){
            for(int j=0;j<array[0].length;j++){
                System.out.println(array[o][j]);
            }
        }
		
		
		
		System.out.println("continuamos con el flujo");
	}

}
