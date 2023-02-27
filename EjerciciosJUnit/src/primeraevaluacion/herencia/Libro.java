package primeraevaluacion.herencia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Libro extends Prestable {
	private ArrayList<String> autores = new ArrayList<>();

	public Libro(String codigo, String titulo, int añoPublicacion) {
		super(codigo, titulo, añoPublicacion);
	}

	public Libro(String codigo, String titulo, int añoPublicacion, String autor) {
		super(codigo, titulo, añoPublicacion);
		autores.add(autor);
	}
	
	public Libro(String codigo, String titulo, int añoPublicacion, String ... autores) {
		super(codigo, titulo, añoPublicacion);
		for(String autor: autores) {
			this.autores.add(autor);
		}
	}

	@Override
	public String toString() {
		return "Libro[" + super.toString() + ", " + autores +  "]";
	}

	public boolean addAutor(String autor) {
		if (autores.contains(autor))
			return false;
		autores.add(autor);
		return true;
	}

	public List<String> getAutores() {
		return Collections.unmodifiableList(autores);
	}

}
