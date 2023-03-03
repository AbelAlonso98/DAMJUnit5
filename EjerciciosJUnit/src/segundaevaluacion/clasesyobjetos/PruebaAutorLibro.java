package segundaevaluacion.clasesyobjetos;

import java.util.ArrayList;

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
		Libro libro = new Libro("El libro de Pepe y María", autores, 20.99f);
		libro.getAutores().add(new Autor("Juan", "", ""));
		System.out.println(libro);
		
	}

}
