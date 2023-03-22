package terceraevaluacion.ficheros;

import java.io.*;
import java.util.Arrays;

public class Ejemplo1 {

	public static void main(String[] args) throws IOException {
		leerFicheroDeByteEnByte();
		// escribirEnFichero1();
		escribirEnFichero2();
		// leerDeFichero1();
		leerDeFichero2();

	}

	static void escribirEnFichero1() throws IOException {
		try (FileOutputStream out = new FileOutputStream("C:\\Users\\TardeDAM\\prueba1")) {
			out.write("hola".getBytes());
			out.write("mundo".getBytes());

		}
	}

	static void escribirEnFichero2() throws IOException {
		try (DataOutputStream out = new DataOutputStream(new FileOutputStream("C:\\Users\\TardeDAM\\prueba2"))) {
			out.writeInt(257);
			out.writeUTF("");
			out.writeUTF("mundo");
			out.writeUTF("mundo");
			out.writeUTF("mundo");
			out.writeUTF("mundo");
			out.writeUTF("mundo");
			out.writeUTF("mundo");
			out.writeUTF("mundo");

		}
	}

	static void leerDeFichero1() throws IOException {
		try (FileInputStream in = new FileInputStream("C:\\Users\\TardeDAM\\prueba1")) {
			byte[] b = new byte[100];
			in.read(b, 0, 4);
			System.out.println(new String(Arrays.copyOf(b, 4)));
		}
	}

	static void leerDeFichero2() throws IOException {
		try (DataInputStream in = new DataInputStream(new FileInputStream("C:\\Users\\TardeDAM\\prueba2"))) {
			System.out.println(in.readInt());
			while (true) {
				try {
					System.out.println(in.readUTF());
				} catch (EOFException e) {
					break;
				}
			}
		}
	}

	static void leerFicheroDeByteEnByte() throws IOException {
		try (InputStream in = Ejemplo1.class.getResourceAsStream("/quijote-es.txt")) {
			long t0 = System.currentTimeMillis();
			int dato = in.read();
			while (dato != -1) {
				dato = in.read();
			}
			long t1 = System.currentTimeMillis();
			System.out.println(t1 - t0);
		}

	}

}
