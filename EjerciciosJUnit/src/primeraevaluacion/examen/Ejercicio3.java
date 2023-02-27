package primeraevaluacion.examen;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el número de palabras: ");
		int numeroString = sc.nextInt();
		String[] cadenas = new String[numeroString];
		for(int i = 0; i < numeroString; i++) {
			System.out.println("Introduce una palabra: ");
			cadenas[i]=sc.next();
		}
		
		System.out.println("Ya están todas las palabras.");
		for(int i=0; i<numeroString; i++)
			System.out.println(cadenas[i]);
		System.out.println("\nPalabras ordenadas.");
		cadenas = ordenar(cadenas);
		String ordenadas="";
		for(int i=0; i<numeroString; i++)
			ordenadas +=" "+ cadenas[i] + " " + cifrar(cadenas[i]);
		System.out.println(ordenadas);
		
		sc.close();

	}
	
	private static String[] ordenar(String[] cadenas) {		
		String[] ordenadas = new String [cadenas.length];
		for(int i=0; i<ordenadas.length;i++) { ordenadas[i] = cadenas[i]; }	
		Arrays.parallelSort(ordenadas);
		return ordenadas;
	}
	
	private static String cifrar(String str) {
		int l = str.length();
		String cifrada = "";
		for(int i=0; i<l; i++) {
			if(Character.toLowerCase(str.charAt(i)) =='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				cifrada+=str.charAt(i)*l;
			else
				cifrada+=str.charAt(i)/l;
		}
		
		return cifrada;
	}

}
