package segundaevaluacion.herencia.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public final class Libro extends Prestable {
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(autores);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autores, other.autores);
	}

	String autores = "";
	
	public Libro(int codigo, String titulo, int año) {
		super(codigo, titulo, año);
	}
	
	public Libro(int codigo, String titulo, int año, String autor) {
		super(codigo, titulo, año);
		this.autores=autor;
	}
	
	public Libro(int codigo, String titulo, int año, String ... autores) {
		super(codigo, titulo, año);
		for (String autor: autores)
			this.autores=autor;
	}

	public boolean addAutor(String autor) {
		if (autores.contains(autor)) 
			return false;
		this.autores=autor;
		return true;
	}
	
	public String getAutores() {
		return this.autores;
	}
	
	@Override
	public String toString() {
		return "Libro [" + super.toString() + ", " + autores + "]";
	}

	@Override
	public int orden() {
		return 0;
	}
	
	@Override
	public int compareTo(Publicacion o) {
		if(super.compareTo(o) == 0)
			return autores.compareTo(((Libro)o).autores);
		return super.compareTo(o);
	}



}
