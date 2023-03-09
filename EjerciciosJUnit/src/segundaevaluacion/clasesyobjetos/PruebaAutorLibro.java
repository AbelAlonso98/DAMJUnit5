package segundaevaluacion.clasesyobjetos;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PruebaAutorLibro {

	public static void main(String[] args) {
		Autor autor = new Autor("Pepe", "pepe@mail.com", "masculino");
		Autor autora = new Autor("María", "notengo@mail.com", "femenino");
		System.out.println(autor);
		System.out.println(autora);
		System.out.println(autor.getNombre());
		ArrayList<Autor> autores = new ArrayList<>();
		autores.add(autor);
		autores.add(autora);
		Libro libro1 = new Libro("El libro de Pepe y María", autores, 20.99f);
		Libro libro2 = new Libro("El libro de Maria", List.of(autora),30.99f);
		Libro libro5 = new Libro("El libro de Maria", List.of(autora),30.99f);
		Libro libro3 = new Libro("El libro de Pepe", List.of(autor),25.99f);
		Libro libro4 = new Libro("El libro de Maria", List.of(autora),25.99f);
		
		ArrayList<Libro> libros = new ArrayList<>(List.of(libro1, libro2, libro3, libro4, libro5));
		libros.forEach(System.out::println);
		System.out.println("---------------ORDENADOS---------------");
		//Collections.sort(libros);
		//libros.forEach(System.out::println);
		//libros.stream().sorted().forEach(System.out::println);
		Set<Libro> s = new HashSet<>(libros);
		s.forEach(System.out::println);
		
		
		
		
	}

}
