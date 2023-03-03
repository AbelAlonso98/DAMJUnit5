package segundaevaluacion.clasesyobjetos;

public enum Palos {
	PICAS('♠'), CORAZONES('♥'), TREBOLES('♣'), DIAMANTES('♦');
	
	private char simbolo;
	
	Palos(char simbolo) {
		this.simbolo = simbolo;
	}

	public char getSimbolo() {
		return simbolo;
	}
	
}
