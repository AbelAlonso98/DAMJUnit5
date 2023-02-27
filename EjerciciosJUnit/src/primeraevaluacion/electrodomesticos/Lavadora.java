package primeraevaluacion.electrodomesticos;

public class Lavadora extends Electrodomestico {

	private int carga = 5;

	public Lavadora(float precioBase, float peso, int carga) {
		super(precioBase, peso);
		this.carga=carga;
		setPrecioFinal(calcularPrecioFinal());
		
		
		
	}

	public Lavadora(float precioBase, String color, char consumo, float peso, float precioFinal) {
		super(precioBase, color, consumo, peso, precioFinal);
	}


	
	public float calcularPrecioFinal() {
		float precio = super.calcularPrecioFinal();
		if (carga > 5)
			precio += precio * 0.1;
		return precio;
	}
	
	@Override
	public String toString() {
		
		return "Lavadora [carga: " + carga + super.toString();
	}
	
	

}
