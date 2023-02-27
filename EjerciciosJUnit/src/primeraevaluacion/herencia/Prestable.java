package primeraevaluacion.herencia;

public abstract class Prestable extends Publicacion{
	
	private boolean prestado;

	public Prestable(String codigo, String titulo, int añoPublicacion) {
		super(codigo, titulo, añoPublicacion);
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
