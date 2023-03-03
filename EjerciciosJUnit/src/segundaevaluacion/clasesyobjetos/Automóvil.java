package segundaevaluacion.clasesyobjetos;

public class Automóvil {
	private String modelo;
	private float capacidadDeposito;
	private float litrosCombustible;
	private float consumoKm;
	private float consumoTotal;
	public String getModelo() {
		return modelo;
	}

	public float getCapacidadDeposito() {
		return capacidadDeposito;
	}

	public float getLitrosCombustible() {
		return litrosCombustible;
	}

	public float getConsumoKm() {
		return consumoKm;
	}

	public float getConsumoTotal() {
		return consumoTotal;
	}

	public float getKm() {
		return km;
	}

	private float km;
	
	public Automóvil(String modelo, float capacidadDeposito, float litrosCombustible, float consumoKm) {
		this.modelo = modelo;
		this.capacidadDeposito = capacidadDeposito;
		this.litrosCombustible = litrosCombustible;
		this.consumoKm = consumoKm;
	}

	public Automóvil(String modelo, float capacidadDeposito, float consumoKm) {
		this.modelo = modelo;
		this.capacidadDeposito = litrosCombustible = capacidadDeposito;
		this.consumoKm = consumoKm;
	}
	
	
	
	public void llenarDeposito() {
		litrosCombustible = capacidadDeposito;
	}
	
	public float llenarDeposito(float litros) {
		float sobrante = litrosCombustible + litros - capacidadDeposito;
		if (sobrante >= 0) {
			litrosCombustible = capacidadDeposito;
			return sobrante;
		}
		litrosCombustible += litros;
		return 0;
	}
	
	public float desplazar(float km) {
		float litros = consumoKm * km;
		if (litros > litrosCombustible) 
			return -1f;
		this.km += km;
		litrosCombustible -= litros;
		consumoTotal += litros;
		return litros;
		
	}
	
}
