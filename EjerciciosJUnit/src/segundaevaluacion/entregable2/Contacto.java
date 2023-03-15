package segundaevaluacion.entregable2;

import java.util.*;

public class Contacto {
	private String name;
    private List<String> phones;

    public Contacto(String name, String phone) {
        this.name = name;
        this.phones = new ArrayList<>();
        this.phones.add(phone);
    }

    public String getName() {
        return this.name;
    }

    public List<String> getPhones() {
        return this.phones;
    }

    public void addPhone(String phone) {
        if (!this.phones.contains(phone)) {
            this.phones.add(phone);
        } else {
            System.out.println("El teléfono ya existe para este contacto.");
        }
    }

    public void removePhone(String phone) {
        if (this.phones.contains(phone)) {
            this.phones.remove(phone);
        } else {
            System.out.println("El teléfono no existe para este contacto.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name).append(": ");
        for (String phone : this.phones) {
            sb.append(phone).append(", ");
        }
        sb.deleteCharAt(sb.length() - 2); // eliminar la última coma y espacio
        return sb.toString();
    }
}
