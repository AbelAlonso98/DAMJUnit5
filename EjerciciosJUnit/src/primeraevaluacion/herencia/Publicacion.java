package primeraevaluacion.herencia;

public abstract class Publicacion {

	private String codigo;
	private String titulo;
	private int añoPublicacion;

	public Publicacion(String codigo, String titulo, int añoPublicacion) {
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}
	

	@Override
	public String toString() {
		return codigo + ", " + titulo +  ", " + añoPublicacion;
	}
}
