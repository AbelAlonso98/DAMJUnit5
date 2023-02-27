package primeraevaluacion.herencia;

public class Revista extends Publicacion {
	private int numero;
	private int mesPublicacion;
	private int diaPublicacion;

	public Revista(String codigo, String titulo, int añoPublicacion, int numero, int mesPublicacion,
			int diaPublicacion) {
		super(codigo, titulo, añoPublicacion);
		this.numero = numero;
		this.mesPublicacion = mesPublicacion;
		this.diaPublicacion = diaPublicacion;
	}

	@Override
	public String toString() {
		return "Revista[" + super.toString() + ", " + numero + ", " + mesPublicacion + ", " + diaPublicacion + "]";
	}

}
