package segundaevaluacion.entregable2;

import java.util.*;

public class Contacto {
	private String nombre;
    private List<String> telefonos;

    public Contacto(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefonos = new ArrayList<>();
        this.telefonos.add(telefono);
    }

    public String getNombre() {
        return this.nombre;
    }

    public List<String> getTelefonos() {
        return this.telefonos;
    }

    public void addTelefono(String telefonos) {
        if (!this.telefonos.contains(telefonos)) {
            this.telefonos.add(telefonos);
        } else {
            System.out.println("El teléfono ya existe para este contacto.");
        }
    }

    public void removeTelefono(String telefono) {
        if (this.telefonos.contains(telefono)) {
            this.telefonos.remove(telefono);
        } else {
            System.out.println("El teléfono no existe para este contacto.");
        }
    }
    
    public void mostrarTelefonos(){
    	StringBuilder sb = new StringBuilder();
        sb.append("Telefono: ");
        for (String phone : this.telefonos) {
            sb.append(phone).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2); // eliminar la última coma y espacio
        System.out.println(sb);
        
    }
    



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nombre).append(": ");
        for (String phone : this.telefonos) {
            sb.append(phone).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2); // eliminar la última coma y espacio
        return sb.toString();
    }
}
