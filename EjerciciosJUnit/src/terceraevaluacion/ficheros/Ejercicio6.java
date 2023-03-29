package terceraevaluacion.ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Ejercicio6 {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		String rutaQuijoteUTF = "C:\\Users\\TardeDAM\\git\\DAMJUnit5\\EjerciciosJUnit\\recursos\\El Quijote UTF8.txt";
		String rutaQuijoteISO = "C:\\Users\\TardeDAM\\git\\DAMJUnit5\\EjerciciosJUnit\\recursos\\El Quijote ISO8859-1.txt";

		// Leemos el UTF8 y vemos que se muestra correctamente
//		try (BufferedReader in = new BufferedReader(new FileReader(rutaQuijoteUTF))) {
//			for (int i = 0; i < 30; i++)			// Leemos 30 lineas.
//				System.out.println(in.readLine());
//		}
		
		// Leemos el ISO y vemos que los caracteres especiales se muestran mal
//		try (BufferedReader in = new BufferedReader(new FileReader(rutaQuijoteISO))) {
//			for (int i = 0; i < 30; i++)			// Leemos 30 lineas.
//				System.out.println(in.readLine());
//		}
		
		// Usamos FileInputStream, que tiene un constructor que le pasa como parametro la codificacion que queremos usar
//		try (BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(rutaQuijoteISO), StandardCharsets.ISO_8859_1))) {
//			for (int i = 0; i < 30; i++)			// Leemos 30 lineas.
//				System.out.println(in.readLine());
//		}
		
		// Lo mismo pero usando el metodo getResourceAsStream de class
		try (BufferedReader in = new BufferedReader(new InputStreamReader(Ejercicio6.class.getResourceAsStream("/El Quijote ISO8859-1.txt"), StandardCharsets.ISO_8859_1))) {
			for (int i = 0; i < 30; i++)			// Leemos 30 lineas.
				System.out.println(in.readLine());
		}
	}

}
