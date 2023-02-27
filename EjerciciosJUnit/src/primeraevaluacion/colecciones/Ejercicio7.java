package primeraevaluacion.colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] numeros = in.readLine().split("\\p{javaWhitespace}+");
		int n = Integer.parseInt(numeros[0]);
		int m = Integer.parseInt(numeros[1]);
		
		numeros = in.readLine().split("\\p{javaWhitespace}+");
				
		Set<Integer> nElementos = new TreeSet<>();
		Set<Integer> mElementos = new TreeSet<>();
		Set<Integer> rElementos = new TreeSet<>();
		for(int i = 0; i<n;i++)
			nElementos.add(Integer.parseInt(numeros[i]));
		for(int j = n; j<m+n;j++) {
			int numero = Integer.parseInt(numeros[j]);
			if(nElementos.contains(numero))
				rElementos.add(numero);
			mElementos.add(numero);
		}
		
		System.out.println("Elementos n: " + nElementos);
		System.out.println("Elementos m: " + mElementos);
		System.out.println("Elementos repetidos: " + rElementos);
			
		
		

	}

}
/*
4 3
1 3 5 7 3 4 5
 */