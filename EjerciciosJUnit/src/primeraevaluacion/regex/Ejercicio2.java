package primeraevaluacion.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce fechas: ");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(validar(in.readLine()));


	}
	
	private static boolean validar(String s) {
		
		Pattern regex = Pattern.compile("[0-9]{2}([-\\.\\/])[a-z]{3}\\1[0-9]{4}");
		Matcher m = regex.matcher(s);
		return m.find();
	}


}

