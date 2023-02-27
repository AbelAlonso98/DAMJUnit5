package primeraevaluacion.electrodomesticos;

public class Television extends Electrodomestico {
	
	private int pulgadas = 20;
	private String sintonizador = "DVB-T";

	public Television(float precioBase, float peso) {
		super(precioBase, peso);

	}

	public Television(float precioBase, String color, char consumo, float peso, float precioFinal) {
		super(precioBase, color, consumo, peso, precioFinal);

	}
	
	@Override
	public String toString() {
		return "Television [pulgadas: " + pulgadas + ", sintonizador: " + sintonizador + super.toString();
	}

}
