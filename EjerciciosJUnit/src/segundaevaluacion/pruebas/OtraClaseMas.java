package segundaevaluacion.pruebas;

public class OtraClaseMas {

	public static void main(String[] args) {
		String s1 = "hola";
		String s2 = "hola";
		String s3 = new String("hola");
		String s4 = new String(s2);
		
		System.out.println(s1 + s2);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		
	}

}
