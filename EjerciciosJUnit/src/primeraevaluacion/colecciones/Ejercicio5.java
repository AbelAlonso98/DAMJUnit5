package primeraevaluacion.colecciones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] tokens = s.nextLine().split("\\p{javaWhitespace}+");
		int n = Integer.parseInt(tokens[0]);
		int k = Integer.parseInt(tokens[1]);
		int x = Integer.parseInt(tokens[2]);
		
		Queue<Integer> cola = new LinkedList<Integer>();
		tokens = s.nextLine().split("\\p{javaWhitespace}+");
		for (String t: tokens)
			cola.offer(Integer.parseInt(t));
		for(int i = 0; i<k;i++)
			cola.poll();
		if(cola.contains(x))
			System.out.println(true);
		else {
			Set<Integer> ordenado = new TreeSet<>();
			for(Integer p: cola)
				ordenado.add(p);
				
			System.out.println(ordenado);
		}
		
	}
}
/*
5 2 32
1 13 45 32 4

5 2 33
1 13 45 32 4
 */