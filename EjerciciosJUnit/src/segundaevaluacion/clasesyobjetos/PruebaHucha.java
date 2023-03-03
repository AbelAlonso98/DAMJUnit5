package segundaevaluacion.clasesyobjetos;

public class PruebaHucha {

	public static void main(String[] args) {
		Hucha hucha = new Hucha("contraseña", 135);
		System.out.println(hucha.retirar(Hucha.CINCUENTA, 1));
		System.out.println(hucha.retirar(100, 1));
	}

}
