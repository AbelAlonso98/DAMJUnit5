package primeraevaluacion.herencia;

public class TestBiblioteca {

	public static void main(String[] args) {
		Revista revista = new Revista("Codigo", "Titulo", 12, 12, 12, 12);
		System.out.println(revista);
		
		Libro libro = new Libro("El quijote", "1", 1605, "Miguel de Cervantes", "El pepe");
		System.out.println(libro);
		
	}

}
