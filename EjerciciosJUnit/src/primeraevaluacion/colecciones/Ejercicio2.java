package primeraevaluacion.colecciones;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio2 {

	public static void main(String[] args) {
		Random r = new Random();
		List<Integer> lista = new LinkedList<>();
		for (int i = 0; i < 100; i++) 
			lista.add(r.nextInt(1000) + 1);
		for(int n: lista)
			System.out.print(n + " ");
		System.out.println();
		
		// Uso de HashSet para evitar duplicados.
		Set<Integer> conjunto = new HashSet<>();
		conjunto.addAll(lista);
		Iterator<Integer> i = conjunto.iterator();
		while(i.hasNext())
			System.out.print(i.next() + " ");
		System.out.println();
		
		// Uso de TreeSet para que aparezcan ordenados
		Set<Integer> conjunto2 = new TreeSet<>();
		conjunto2.addAll(lista);
		conjunto2.forEach(n -> System.out.print(n + " "));
		
		

	}

}
