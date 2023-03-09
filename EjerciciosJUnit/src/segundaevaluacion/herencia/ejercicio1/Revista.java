package segundaevaluacion.herencia.ejercicio1;

import java.util.Objects;

public class Revista extends Publicacion{
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(dia, mes, numero);
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
		Revista other = (Revista) obj;
		return dia == other.dia && mes == other.mes && numero == other.numero;
	}

	private int numero;
	private int mes;
	private int dia;
	
	public Revista(int codigo, String titulo, int año, int numero, int mes, int dia) {
		super(codigo, titulo, año);
		this.numero = numero;
		this.mes = mes;
		this.dia = dia;
	}

	public int getNumero() {
		return numero;
	}

	public int getMes() {
		return mes;
	}

	public int getDia() {
		return dia;
	}
	
	@Override
	public String toString() {
		return "Revista [" + super.toString() + ", " + numero + ", " + mes + ", " + dia + "]";
	}

	@Override
	public int orden() {
		return 1;
	}


	
}
