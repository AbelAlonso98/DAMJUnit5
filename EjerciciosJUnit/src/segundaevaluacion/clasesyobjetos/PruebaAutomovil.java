package segundaevaluacion.clasesyobjetos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PruebaAutomovil {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(in.readLine());
		ArrayList<Automóvil> automoviles = new ArrayList<>();
		String linea;
		String [] items;
		for (int i=0; i<n; i++) {
			linea = in.readLine();
			items = linea.split(" ");
			automoviles.add(new Automóvil(
					items[0],
					Float.parseFloat(items[1]),
					Float.parseFloat(items[2]),
					Float.parseFloat(items[3])
					));
		}
		while (!(linea = in.readLine()).equals("fin")) {
			items = linea.split(" ");
			for (Automóvil a: automoviles) {
				if (items[1].equals(a.getModelo())) {
					float litros = a.desplazar(Float.parseFloat(items[2]));
					if (litros == -1)
						System.out.println("Combustible insuficiente para este desplazamiento");
					else
						System.out.printf("%s %.2f %.2f\n", a.getModelo(), a.getLitrosCombustible(), litros);
				}
			}
		}
		System.out.println("-------------------------------------");
		for (Automóvil a: automoviles)
			System.out.printf("%s %f %f\n", a.getModelo(), a.getKm(), a.getConsumoTotal());
	}

}

/*
2
AudiA4 80 23 0.3
BMW-M2 75 45 0.42
desplazar AudiA4 5
desplazar BMW-M2 56
desplazar AudiA4 13
fin

*/