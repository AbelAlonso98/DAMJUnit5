package segundaevaluacion.herencia.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SociedadAnonima extends Empresa {

	ArrayList<String> trabajos = new ArrayList<>();

	public SociedadAnonima(String nombre, String ... trabajos) {
		super(nombre);
		for (String trabajo: trabajos)
			this.trabajos.add(trabajo);
	}
	
	public boolean addTrabajo(String trabajo) {
		if (trabajos.contains(trabajo))
			return false;
		trabajos.add(trabajo);
		return true;
	}
	
	public List<String> getTrabajos() {
		return Collections.unmodifiableList(trabajos);
	}

	@Override
	public String toString() {
		return super.toString() + " SociedadAnonima [trabajos=" + trabajos + "]";
	}
	
	public static void main(String[] args) {
		SociedadAnonima sa = new SociedadAnonima("empresa", "arquitectura", "demolición");
	}
	
}
