package segundaevaluacion.herencia.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AutorTituloComparator implements Comparator<Publicacion> {

	/*
	 * Libros por autor y luego por titulo
	 */
	@Override
	public int compare(Publicacion o1, Publicacion o2) {
		
		String autor1 = o1.getClass() == Revista.class ? "" : ((Libro) o1).getAutores();
		String autor2 = o2.getClass() == Revista.class ? "" : ((Libro) o2).getAutores();

		if (autor1.compareTo(autor2) == 0)
			return o1.getTitulo().compareTo(o2.getTitulo());
		return autor1.compareTo(autor2);
	}

	public static void main(String[] args) {
		ArrayList<Publicacion> publicaciones = new ArrayList<>();
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Pepin"));
		publicaciones.add(new Libro(1, "El Quijote", 1605, "Miguel de Cervantes"));
		publicaciones.add(new Revista(2, "Hola", 1023, 5974, 1, 7));
		publicaciones.add(new Libro(3, "El Principito", 1805, "Anonimo"));
		publicaciones.add(publicaciones.get(0));
		publicaciones.add(new Libro(4, "Hel Quijote", 1605, "Miguel de Cervantes"));
		Collections.sort(publicaciones, new AutorTituloComparator());
		publicaciones.forEach(System.out::println);
	}

}
