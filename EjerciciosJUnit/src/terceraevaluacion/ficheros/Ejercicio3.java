package terceraevaluacion.ficheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Programa que lea un fichero de texto plano y muestre en la consola el número de caracteres, el número de
 * palabras y el número de líneas que contiene, entendiendo por palabra cualquier secuencia de caracteres alfabeticos
 * que no contenga espacios. La ruta al fichero se puede especificar en un parámetro de línea de comando. Si
 * no se especifica de esa forma, se pedirá por teclado.
 * */
public class Ejercicio3 { 

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
		System.out.println("Numero de lineas: " + conLineas);
		System.out.println("Numero de palabras: " + conPalabras);
		System.out.println("Numero de caracteres: " + conCaracteres);
		

//		try(DataInputStream in = new DataInputStream(Ejercicio3.class.getResourceAsStream("/quijote-es.txt"))){
//			try{
//				String texto = in.readUTF();
//				System.out.println(texto);
//				}catch(EOFException e) {
//				System.out.println("Archivo vacio.");
//			}
//			
//		}
			
		
	}
	
	private static String pedirRuta() throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Introduce ruta: ");
		return in.readLine();
	}
	

}
