package segundaevaluacion.herencia.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;

public class Biblioteca {

	public static void main(String[] args) {
		
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Pepin"));
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Miguel de Cervantes"));
		publicaciones.add(new Revista(2, "Hola", 1023, 5974, 1, 7));
		publicaciones.add(new Libro(3, "El Principito", 1805, "Anonimo"));
		publicaciones.add(publicaciones.get(0));
		publicaciones.add(new Libro(4, "El Quijote", 1605, "Miguel de Cervantes"));
		System.out.println(publicaciones.get(0).equals(publicaciones.get(1)));
		System.out.println(publicaciones.get(0).equals(publicaciones.get(0)));

		Collections.sort(publicaciones);
		publicaciones.forEach(System.out::println);;
		
	}

}
