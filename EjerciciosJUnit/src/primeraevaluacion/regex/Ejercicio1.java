package primeraevaluacion.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {
	
	String s = "María Pérez Fernández, Alberto González, Mariano Jiménez, Laura Martinez López";

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriba nombres: ");
		Pattern regex = Pattern.compile("\\b[A-ZÁÉÍÓÚÜ][a-záéíóú]+\\b(?: \\b[A-ZÁÉÍÓÚ][a-záéíóú]+\\b)+");
		// \\b captura el limite de una palabra y ?: hace que el parentesis no sea un grupo de captura
		Matcher m = regex.matcher(in.readLine());
		while( m.find())
			System.out.println(m.group());
		
		
	}
	
}
