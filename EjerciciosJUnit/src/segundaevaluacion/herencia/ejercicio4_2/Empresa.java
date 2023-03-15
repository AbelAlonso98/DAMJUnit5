package segundaevaluacion.herencia.ejercicio4_2;

public abstract class Empresa {

	private String nombre;

	public Empresa(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + "]";
	}
	

}
