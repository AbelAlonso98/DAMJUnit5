package primeraevaluacion.herencia;

import java.util.ArrayList;

public class Biblioteca {

	private ArrayList<Publicacion> publicaciones = new ArrayList<>();

	Biblioteca(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public boolean prestar(Publicacion publicacion) {
		if( publicacion instanceof Revista)
			return false;
		for (Publicacion p : publicaciones)
			if (p.equals(publicacion)) {
				((Prestable) publicacion).prestar();
				return true;
			}
		return false;
	}

}
