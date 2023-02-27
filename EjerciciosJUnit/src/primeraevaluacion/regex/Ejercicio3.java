package primeraevaluacion.regex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Pattern regex = Pattern.compile(">>(\\p{L}+)<<(\\d+(?:\\.\\d+)?)!(\\d+)");
		StringBuilder sb = new StringBuilder();
		String linea;
		while(!(linea=in.readLine()).equals("comprar")) {
			sb.append(linea);
		}
		Matcher m = regex.matcher(sb);
		System.out.println("Compra:");
		float total = 0;
		while(m.find()) {
			System.out.println(m.group(1) + " (" + m.group(3) + "), ");
			total+=Float.parseFloat(m.group(2));		
			}
		System.out.println("Total:");
		System.out.println(String.valueOf(total));
		}
		
		
	}
	
