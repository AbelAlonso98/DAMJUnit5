package terceraevaluacion.ficheros;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

import segundaevaluacion.entregable1.Palabras;

public class Ejercicio7 {

	public static void main(String[] args) throws IOException {
		Palabras palabras = new Palabras();
		
		try (BufferedReader in = new BufferedReader(new InputStreamReader(Ejercicio6.class.getResourceAsStream("/lemario-general-del-espanol.txt"), StandardCharsets.ISO_8859_1))){
			String texto;
			while((texto = in.readLine())!=null){
				Arrays.stream(texto.split("\\s+")).forEach(s -> palabras.agregarPalabra(s));
			}
		}
		
		palabras.mostrarPalabras();	
		

	}

}
