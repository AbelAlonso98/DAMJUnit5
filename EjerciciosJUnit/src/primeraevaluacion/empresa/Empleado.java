package primeraevaluacion.empresa;

public abstract class  Empleado implements Pagable{

	private String nombre;
	private String apellidos;
	private String fechaContratacion;
	private String numeroCuenta;

	public Empleado(String nombre, String apellidos, String fechaContratacion, String numeroCuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaContratacion = fechaContratacion;
		this.numeroCuenta = numeroCuenta;
	}

	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getFechaContratacion() {
		return fechaContratacion;
	}

}
