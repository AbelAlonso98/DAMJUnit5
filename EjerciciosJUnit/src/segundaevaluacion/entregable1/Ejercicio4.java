package segundaevaluacion.entregable1;

import java.util.*;

public class Ejercicio4 {
	public static void main(String[] args) {
		Palabras palabras = new Palabras();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Ingrese un comando: ");
			String comando = sc.nextLine();

			if (comando.startsWith("añadir: ")) {
				String cadena = comando.substring(8);
				palabras.agregarPalabras(cadena);
			} else if (comando.startsWith("lista ")) {
				int longitud = Integer.parseInt(comando.substring(6));
				Set<String> palabrasDeLongitud = palabras.obtenerPalabrasDeLongitud(longitud);
				System.out.println("Palabras de longitud " + longitud + ": " + palabrasDeLongitud);
			} else if (comando.equals("borrar")) {
				palabras.borrarPalabras();
			} else if (comando.startsWith("borrar: ")) {
				String cadena = comando.substring(8);
				palabras.borrarPalabras(cadena);
			} else if (comando.equals("fin")) {
				palabras.borrarPalabras();
				break;
			} else {
				System.out.println("Comando no válido.");
			}
		}
		sc.close();
	}
}
