package primeraevaluacion.repasoExamen;

import java.util.Scanner;

public class Ejercicio4 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe palabra: ");
		String palabra = sc.next();
		System.out.println("Escribe numero: ");
		int numero = sc.nextInt();
		System.out.println(repeatFront(palabra, numero));
		System.out.println(repeatFront2(palabra, numero));
		sc.close();
	}

	private static String repeatFront(String str, int n) {
		StringBuilder resultado = new StringBuilder();
		while(n>0) {
			for(int i=0; i<n;i++) {
				resultado = resultado.append(str.charAt(i));
			}	
			n--;
		}
		return resultado.toString();
		
	}
	
	private static String repeatFront2(String str, int n) {
		StringBuilder resultado = new StringBuilder();
			for(int i=n; i>0;i--) {
				resultado.append(str.subSequence(0, i));
			}			
		return resultado.toString();
	}
}
