package segundaevaluacion.entregable2;

import java.util.*;

public class Agenda {
	Set<Contacto> contactos;

	public Agenda() {
		contactos = new HashSet<>();
	}

	public Agenda(Contacto c) {
		contactos = new HashSet<>();
		añadirContacto(c);
	}

	public void añadirContacto(Contacto c) {
		if (!contactos.add(c))
			System.out.println("Ese contacto ya existe.");
		else
			contactos.add(c);
	}

	public void eliminarContacto(Contacto c) {
		if (!contactos.contains(c))
			System.out.println("Ese contacto no está en la agenda.");
		else
			contactos.remove(c);

	}

	public void mostrarContactos() {
		contactos.stream().forEach(System.out::println);
	}

	public Contacto getContacto(String nombre) {
		for (Contacto c : contactos) {
			if (c.getNombre().equals(nombre))
				return c;
		}
		return null;
	}

}
