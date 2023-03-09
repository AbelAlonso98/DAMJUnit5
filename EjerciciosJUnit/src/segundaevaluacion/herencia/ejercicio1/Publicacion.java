package segundaevaluacion.herencia.ejercicio1;

import java.util.Objects;

public abstract class Publicacion implements Comparable<Publicacion> {
	private int codigo;
	private String titulo;
	private int año;

	public Publicacion(int codigo, String titulo, int año) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.año = año;
	}

	public int getCodigo() {
		return codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public int getAño() {
		return año;
	}

	@Override
	public String toString() {
		return codigo + ", " + titulo + ", " + año;
	}

	@Override
	public int hashCode() {
		return Objects.hash(año, codigo, titulo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Publicacion other = (Publicacion) obj;
		return año == other.año && codigo == other.codigo && Objects.equals(titulo, other.titulo);
	}

	public abstract int orden();
	
	@Override
	public int compareTo(Publicacion o) {
		int cTipo = orden()-o.orden();
		if(cTipo == 0) {
			if (año == o.año) {
				if (titulo.equals(o.titulo)) {
					return codigo - o.codigo;
				}
				return titulo.compareTo(o.titulo);
			}
			return año - o.año;
		}
		return cTipo;
	}

}
