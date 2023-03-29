package terceraevaluacion.ficheros;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio4 {

	public static void main(String[] args) throws IOException {
		String fichero = "";
		int conCaracteres = 0;
		int conPalabras = 0;
		int conLineas = 0;
		if(args.length==1)
			fichero=args[0];
		else
			fichero = pedirRuta();
		try(BufferedReader in = new BufferedReader(new FileReader(fichero))){
		
			
			
			String linea;
			linea = in.readLine();
			while( linea != null) {
				conLineas++;
				conCaracteres += linea.length();
				conPalabras += linea.split("\\P{L}+").length;
				
				linea = in.readLine();
			}

		}
//		String fichero2 = pedirRuta();
//		try(BufferedWriter out = new BufferedWriter(new FileWriter(fichero2))){
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream("datos", true))) {
		
			out.writeUTF(fichero);
			out.writeInt(conCaracteres);
			out.writeInt(conPalabras);
			out.writeInt(conLineas);
			
		}

	}
	
	private static String pedirRuta() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce ruta: ");
		return in.readLine();
	}

}
