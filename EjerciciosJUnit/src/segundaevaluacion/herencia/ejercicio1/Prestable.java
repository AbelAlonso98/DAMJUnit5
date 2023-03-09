package segundaevaluacion.herencia.ejercicio1;

public abstract class Prestable extends Publicacion {

	private boolean prestado;
	
	public Prestable(int codigo, String titulo, int año) {
		super(codigo, titulo, año);
	}

	public void prestar() {
		prestado = true;
	}
	
	public void devolver() {
		prestado = false;
	}
	
	public boolean isPrestado() {
		return prestado;
	}

}
