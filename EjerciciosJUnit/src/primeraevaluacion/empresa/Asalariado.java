package primeraevaluacion.empresa;

public class Asalariado extends Empleado {

	public Asalariado(String nombre, String apellidos, String fechaContratacion, String numeroCuenta) {
		super(nombre, apellidos, fechaContratacion, numeroCuenta);
	}

	@Override
	public String pagar() {
		return "Pagado Asalariado: " + getNombre() + "(" + getNumeroCuenta() + ").";

	}

}
