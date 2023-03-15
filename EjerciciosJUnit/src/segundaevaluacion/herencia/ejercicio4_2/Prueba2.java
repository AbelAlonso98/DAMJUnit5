package segundaevaluacion.herencia.ejercicio4_2;

import java.time.Instant;
import java.util.Comparator;
import java.util.Date;
import java.util.Set;
import java.util.TreeSet;


public class Prueba2 {

	public static void main(String[] args) {
		Set<Pagable> pagables = new TreeSet<>(new Comparator<Pagable>() {

			@Override
			public int compare(Pagable o1, Pagable o2) {
				String nombre1;
				String nombre2;
				if (o1.getClass() == Asalariado.class)
					nombre1 = ((Asalariado) o1).getNombre();
				else if (o1.getClass() == Contratista.class)
					nombre1 = ((Contratista) o1).getNombre();
				else
					nombre1 = ((EmpresaServicios) o1).getNombre();
				if (o2.getClass() == Asalariado.class)
					nombre2 = ((Asalariado) o2).getNombre();
				else if (o2.getClass() == Contratista.class)
					nombre2 = ((Contratista) o2).getNombre();
				else
					nombre2 = ((EmpresaServicios) o2).getNombre();

				return nombre1.compareTo(nombre2);

			}
			
		});

		pagables.add(new Asalariado("Pepe", "Pérez", Date.from(Instant.now()), "1"));
		pagables.add(new Contratista("Pepín", "López", Date.from(Instant.now()), "2",
				new SociedadAnonima("La empresa de Pepín", "Arquitectura", "Demolición")));
		pagables.add(new EmpresaServicios("Yoigo", "Telefonía", "3"));

		// pagables.forEach(p -> System.out.println(p));

		pagables.forEach(System.out::println);
	}

}