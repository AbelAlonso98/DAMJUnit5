package primeraevaluacion.empresa;

import java.util.ArrayList;

public class SociedadAnonima {
	private String nombre;
	private ArrayList<String> trabajos = new ArrayList<String>();

	public SociedadAnonima(String nombre, ArrayList<String> trabajos) {
		this.nombre = nombre;
		this.trabajos = trabajos;
	}

	public boolean addTrabajo(String trabajo) {
		if (trabajos.contains(trabajo))
			return false;
		trabajos.add(trabajo);
		return true;
	}

	public boolean removeTrabajo(String trabajo) {
		if (!trabajos.contains(trabajo))
			return false;
		trabajos.remove(trabajo);
		return true;
	}

	public String getNombre() {
		return nombre;
	}
}
