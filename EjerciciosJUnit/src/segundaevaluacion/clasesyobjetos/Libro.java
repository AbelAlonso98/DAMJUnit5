package segundaevaluacion.clasesyobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Libro implements Comparable<Libro> {

	private String titulo;
	private List<Autor> autores = new ArrayList<>();;
	private float precio;
	private int stock;

	public Libro(String titulo, List<Autor> autores, float precio, int stock) {
		this.titulo = titulo;
		this.autores.addAll(autores);
		this.precio = precio;
		this.stock = stock;
	}

	public Libro(String titulo, List<Autor> autores, float precio) {
		this(titulo, autores, precio, 0);
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<Autor> getAutores() {
		return (ArrayList<Autor>) Collections.unmodifiableList(autores);
	}

	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();

		s.append(titulo);
		s.append(" (");
		for (int i = 0; i < autores.size(); i++) {
			s.append(autores.get(i).getNombre());
			if (i < autores.size() - 1)
				s.append(", ");
		}
		s.append(") ");
		s.append(String.format("%.2f", precio));
		s.append("€ - ");
		s.append(stock);
		s.append(" unidades en stock");

		return s.toString();
	}

	@Override
	public int hashCode() {
		return Objects.hash(autores, precio, stock, titulo);

	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		return Objects.equals(autores, other.autores)
				&& Float.floatToIntBits(precio) == Float.floatToIntBits(other.precio) && stock == other.stock
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public int compareTo(Libro l) {
		int resultado = titulo.compareTo(l.titulo);
		if (resultado == 0) {
			float p = l.precio;
			return precio < p ? -1 : precio > p ? 1 : 0;
		}
		return resultado;
	}

	public static void main(String[] args) {
		List<Autor> autores = List.of(new Autor("Pepin", "elmaildepepin@gmail.com", "masculino"));
		Libro l1 = new Libro("El libro de Pepin", autores, 3500.99f);
		Libro l2 = new Libro("El libro de Pepin", autores, 4500.99f);
		Set<Libro> set = new TreeSet<>();
		set.add(l1);
		set.add(l2);
		set.stream().forEach(System.out::println);
	}
}
