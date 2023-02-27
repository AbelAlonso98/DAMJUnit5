package primeraevaluacion.electrodomesticos;

public abstract class Electrodomestico {

	private float precioBase = 100f;
	private String color;
	private char consumo = 'F';
	private float peso = 5f;
	private float precioFinal;

	public Electrodomestico(float precioBase, float peso) {
		this.precioBase = precioBase;
		this.peso = peso;
		this.precioFinal = calcularPrecioFinal();
	}

	public float calcularPrecioFinal() {
		float precio = precioBase;

		if (consumo == 'A')
			precio += 0.3 * precio;
		if (consumo == 'B')
			precio += 0.25 * precio;
		if (consumo == 'C')
			precio += 0.2 * precio;
		if (consumo == 'D')
			precio += 0.15 * precio;
		if (consumo == 'E')
			precio += 0.1 * precio;
		if (consumo == 'F')
			precio += 0.05 * precio;
		if (peso < 20)
			precio += precio * 0.05;
		if (peso >= 20 & peso < 50)
			precio += precio * 0.1;
		if (peso >= 50 & peso < 80)
			precio += precio * 0.15;
		if (peso > 80)
			precio += precio * 0.2;
		
		return precio;

	}

	public Electrodomestico(float precioBase, String color, char consumo, float peso, float precioFinal) {
		this.precioBase = precioBase;
		this.color = color;
		this.consumo = consumo;
		this.peso = peso;
		this.precioFinal = precioFinal;
	}
	
	@Override
	public String toString() {
		return ", precioBase=" + precioBase + ", color=" + color + ", consumo=" + consumo + ", peso="
				+ peso + ", precioFinal=" + precioFinal + "]";
	}
	
	protected void setPrecioFinal(float precio) {
		this.precioFinal=precio;
	}

}
