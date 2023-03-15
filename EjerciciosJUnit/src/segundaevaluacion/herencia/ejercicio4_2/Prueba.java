package segundaevaluacion.herencia.ejercicio4_2;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class Prueba {

	public static void main(String[] args) {
		ArrayList<Pagable> pagables = new ArrayList<>();
		
		pagables.add(new Asalariado("Pepe", "Pérez", Date.from(Instant.now()), "1"));
		pagables.add(
				new Contratista(
						"Pepín",
						"López",
						Date.from(Instant.now()),
						"2",
						new SociedadAnonima("La empresa de Pepín", "Arquitectura", "Demolición")));
		pagables.add(new EmpresaServicios("Yoigo", "Telefonía", "3"));
		
		pagables.forEach(p -> System.out.println(p));
		
		pagables.get(1).cobrar(23543.99f);
	}

}
