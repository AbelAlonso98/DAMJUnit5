package segundaevaluacion.herencia.ejercicio1;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TestPublicacion {

	public static void main(String[] args) {
		Publicacion pub1 = new Libro(1, "titulo", 1);
		Publicacion pub2 = new Revista(2, "titulo2", 2, 2, 2, 2);
		Set<Publicacion> set = new TreeSet<>(List.of(pub1, pub2));
		set.forEach(System.out::println);

	}

}
