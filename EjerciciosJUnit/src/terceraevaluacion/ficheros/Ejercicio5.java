package terceraevaluacion.ficheros;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejercicio5 {

	public static void main(String[] args) throws IOException {

//		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("datos", true))) {
//			out.writeUTF("hola");
//			out.writeInt(10);
//		}
		
		try (DataInputStream in = new DataInputStream(new FileInputStream("datos"));
				PrintWriter out = new PrintWriter(new FileWriter("datos.txt"))) {
			
			String fichero = "";
			int numCaracteres = 0;
			int numPalabras = 0;
			int numLineas = 0;
			while (true) {
				try {
				 fichero = in.readUTF();
				} catch (EOFException e) {
					break;
				}
				try {
					numCaracteres = in.readInt();
					numPalabras = in.readInt();
					numLineas = in.readInt();
				} catch (EOFException e) {
					System.err.println("Faltan datos.");
					break;
				}
				System.out.printf("%s - %d - %d - %d\n", fichero, numCaracteres, numPalabras, numLineas);
				
				out.println(fichero);
				out.printf("Numero de caracteres: %d\n", numCaracteres);
				out.printf("Numero de palabras: %d\n", numPalabras);
				out.printf("Numero de lineas: %d\n", numLineas);

			}
		} catch (EOFException e1) {
		}
	}
}
