package segundaevaluacion.clasesyobjetos;

public class Naipe {
	private Palos palo;
	private Rangos rango;
	private int valor;
	
	public Naipe(Palos palo, Rangos rango, int valor) {
		this.palo = palo;
		this.rango = rango;
		this.valor = valor;
	}
	
	public Naipe(Palos palo, Rangos rango) {
		this.palo = palo;
		this.rango = rango;
		valor = rango.ordinal() + 1;
	}
	
	public Palos getPalo() {
		return palo;
	}



	public Rangos getRango() {
		return rango;
	}

	public int getValor() {
		return valor;
	}	
	
}
