package primeraevaluacion.empresa;

public class EmpresaServicios implements Pagable{
	private String nombre;
	private String servicio;
	private String numeroCuenta;

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getServicio() {
		return servicio;
	}

	@Override
	public String pagar() {
		return "Pagado Empresa Servicios: " + getNombre() + "(" + getNumeroCuenta() + ").";
		
	}

}
