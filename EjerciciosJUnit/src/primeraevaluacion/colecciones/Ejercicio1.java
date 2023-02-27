package primeraevaluacion.colecciones;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class Ejercicio1 {

	public static void main(String[] args) throws  IOException {
		Set<String> nombres = new TreeSet<>();
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		for(int i = 0 ; i < n; i++)
			nombres.add(in.readLine());
		System.out.println(nombres);
		

	}

}

/*
6
Iván
Iván
Iván
Manuela
Iván
Fernando
 */