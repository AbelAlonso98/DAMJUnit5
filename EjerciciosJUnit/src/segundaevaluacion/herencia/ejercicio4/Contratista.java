package segundaevaluacion.herencia.ejercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

public class Contratista extends Asalariado {

	ArrayList<SociedadAnonima> empresas = new ArrayList<>();
	
	public Contratista(String nombre, String apellidos, Date fecha, String cuenta, SociedadAnonima ... empresas) {
		super(nombre, apellidos, fecha, cuenta);
		for (SociedadAnonima empresa: empresas)
			this.empresas.add(empresa);
	}
	
	public List<SociedadAnonima> getEmpresas() {
		return Collections.unmodifiableList(empresas);
	}

	@Override
	public String toString() {
		return super.toString() + " Contratista [empresas=" + empresas + "]";
	}
	
	@Override
	public void cobrar(float importe) {
		System.out.println(String.format("El contratista %s recibe %.2f € por los trabajos realizados por sus empresas", getNombre(), importe));
	}
	
	

}
