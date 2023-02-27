package primeraevaluacion.empresa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Contratista extends Empleado {
	private ArrayList<SociedadAnonima> sociedades = new ArrayList<>();

	public Contratista(String nombre, String apellidos, String fechaContratacion, String numeroCuenta) {
		super(nombre, apellidos, fechaContratacion, numeroCuenta);
	}

	public Contratista(String nombre, String apellidos, String fechaContratacion, String numeroCuenta,
			ArrayList<SociedadAnonima> sociedades) {
		super(nombre, apellidos, fechaContratacion, numeroCuenta);
		this.sociedades = sociedades;
	}
	
	public List<SociedadAnonima> getSociedades(){
		return Collections.unmodifiableList(sociedades);
	}
	
	@Override
	public String pagar() {
		return "Pagado Contratista: " + getNombre() + "(" + getNumeroCuenta() + ").";

	}

}
