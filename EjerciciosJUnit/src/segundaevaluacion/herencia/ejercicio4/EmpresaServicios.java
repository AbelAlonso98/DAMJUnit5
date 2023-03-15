package segundaevaluacion.herencia.ejercicio4;

public class EmpresaServicios extends Empresa implements Pagable {

	private String servicio;
	private String cuenta;
	
	public EmpresaServicios(String nombre, String servicio, String cuenta) {
		super(nombre);
		this.servicio = servicio;
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getServicio() {
		return servicio;
	}

	@Override
	public String toString() {
		return super.toString() + " EmpresaServicios [servicio=" + servicio + ", cuenta=" + cuenta + "]";
	}

	@Override
	public void cobrar(float importe) {
		System.out.println(String.format("La empresa %s cobra por sus servicios %.2f €", getNombre()));
	}
	
	@Override
	public int compareTo(Pagable o) {
		String nombre;
		if(o.getClass() == Asalariado.class)
			nombre = ((Asalariado) o ).getNombre();
		else if(o.getClass() == Contratista.class)
			nombre = ((Contratista) o).getNombre();
		else
			nombre = ((EmpresaServicios) o).getNombre();
		return getNombre().compareTo(nombre);
	}
	
}
