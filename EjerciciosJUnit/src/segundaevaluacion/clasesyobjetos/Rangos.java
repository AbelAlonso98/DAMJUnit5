package segundaevaluacion.clasesyobjetos;

public enum Rangos {
	ACE, DOS, TRES, CUATRO, CINCO, SEIS, SIETE, OCHO, NUEVE, DIEZ, JAKE, QUEEN, KING;
	
	public boolean esFigura() {
		return this == JAKE || this == QUEEN || this == KING || this == ACE;
	}
}
