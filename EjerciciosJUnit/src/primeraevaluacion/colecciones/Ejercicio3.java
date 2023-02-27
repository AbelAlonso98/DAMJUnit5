package primeraevaluacion.colecciones;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio3 {

//	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		Set<String> seRepiten = new TreeSet<>();
//		Set<String> noSeRepiten = new TreeSet<>();
//		String linea = s.nextLine();
//		String[] palabras = linea.split("\\P{L}+"); // Separador cualquier caracter no alfabetico
//		for (String p : palabras) {
//			if (!noSeRepiten.add(p)) {
//				seRepiten.add(p);
//				noSeRepiten.remove(p);
//			}
//		}
//		System.out.println("Se repiten: " + seRepiten);
//		System.out.println("No se repiten: " +noSeRepiten);
//		s.close();
//
//	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Set<String> seRepiten = new TreeSet<>();
		Set<String> noSeRepiten = new TreeSet<>();
		s.useDelimiter("\\P{L}+");
		while (s.hasNext()) {
			String p = s.next();
			noSeRepiten.add(p);
			if (!noSeRepiten.add(p)) {
				seRepiten.add(p);
				noSeRepiten.remove(p);
			}
		}

		System.out.println("Se repiten: " + seRepiten);
		System.out.println("No se repiten: " + noSeRepiten);
		s.close();

	}
}
