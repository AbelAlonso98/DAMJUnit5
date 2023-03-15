package segundaevaluacion.herencia.ejercicio4;

import java.time.Instant;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;

public class Prueba2 {

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
		
		//pagables.forEach(p -> System.out.println(p));
		
		Collections.sort(pagables);
		pagables.forEach(System.out::println);
	}

}