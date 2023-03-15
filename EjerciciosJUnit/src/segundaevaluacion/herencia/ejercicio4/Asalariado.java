package segundaevaluacion.herencia.ejercicio4;

import java.util.Date;

public class Asalariado implements Pagable{

	private String nombre;
	private String apellidos;
	private Date fecha;
	private String cuenta;
	
	public Asalariado(String nombre, String apellidos, Date fecha, String cuenta) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fecha = fecha;
		this.cuenta = cuenta;
	}

	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public Date getFecha() {
		return fecha;
	}

	@Override
	public String toString() {
		return "Asalariado [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha=" + fecha + ", cuenta=" + cuenta
				+ "]";
	}

	@Override
	public void cobrar(float importe) {
		System.out.println(String.format("El asalariado %s recibe su nomina de %.2f € ", nombre, importe));		
	}

	@Override
	public int compareTo(Pagable o) {
		return nombre.compareTo(o.getClass() == Asalariado.class ? ((Asalariado) o).getNombre() :((EmpresaServicios) o).getNombre());
	}
	
}
