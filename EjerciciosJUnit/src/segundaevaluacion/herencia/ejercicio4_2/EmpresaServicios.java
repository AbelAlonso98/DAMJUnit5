package segundaevaluacion.herencia.ejercicio4_2;

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
	

}
