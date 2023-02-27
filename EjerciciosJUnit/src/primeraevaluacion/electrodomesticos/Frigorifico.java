package primeraevaluacion.electrodomesticos;

public class Frigorifico extends Electrodomestico {
	
	private boolean NoFrost = false;

	public Frigorifico(float precioBase, float peso) {
		super(precioBase, peso);
	}

	public Frigorifico(float precioBase, String color, char consumo, float peso, float precioFinal) {
		super(precioBase, color, consumo, peso, precioFinal);
	}
	
	@Override
	public String toString() {
		return "Frigorifico [NoFrost: " + NoFrost + super.toString();
	}

}
