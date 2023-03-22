package segundaevaluacion.entregable2;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Agenda a = new Agenda();


		while (true) {
			System.out.println("Ingrese un comando: ");
			String nombre = "";
			String comando = sc.nextLine();

			if (comando.startsWith("buscar:")) {
				nombre = comando.substring(7);
				if(a.getContacto(nombre) != null)
					a.getContacto(nombre).mostrarTelefonos();
				else
					System.out.println("No existe ese contacto.");
			} else if (comando.startsWith("eliminar:")) {
				nombre = comando.substring(9);
				if(a.getContacto(nombre) != null) {
					System.out.println("¿Seguro que desea eliminar el contacto " + nombre + "? (Y/N)");
					String confirmacion = sc.nextLine();
					if(confirmacion.equals("Y")) {
						a.eliminarContacto(a.getContacto(nombre));
						System.out.println("Contacto eliminado correctamente.");
					}
					else if(confirmacion.equals("N"))
						System.out.println("No se ha borrado el contacto.");
					else
						System.out.println("Comando no válido.");
				}
				else
					System.out.println("No existe ese contacto.");
			} else if (comando.equals("contactos")) {
				a.mostrarContactos();
			} else if (comando.equals("salir")) {
				break;
				
			}else if(comando.matches("^[a-zA-Z]+:[0-9]{9}")) {
				String[] datos = comando.split(":");
				if(a.getContacto(datos[0]) != null)
					a.getContacto(datos[0]).addTelefono(datos[1]);
				else
					a.añadirContacto(new Contacto(datos[0], datos[1]));
			}
			
			else {
				System.out.println("Comando no válido.");
			}
		}
		sc.close();
	}
}
