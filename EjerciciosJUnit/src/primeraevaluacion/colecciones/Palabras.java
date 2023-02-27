package primeraevaluacion.colecciones;

import java.util.Set;
import java.util.TreeSet;

public class Palabras {

	Set<String> palabras;

	public Palabras() {
		this.palabras = new TreeSet<>();
	}
	
	public Palabras(String cadena) {
		this.palabras = new TreeSet<>();
		String[] palabrasParametro = cadena.split(" ");
		for(String p: palabrasParametro)
			palabras.add(p);
	}
	
	public boolean añadirPalabra(String palabra) {
		return palabras.add(palabra);
	}
	
	public void añadirCadena(String cadena) {
		String[] palabrasParametro = cadena.split(" ");
		for(String p: palabrasParametro)
			palabras.add(p);
	}
	
	public boolean isContenida(String palabra) {
		return palabras.contains(palabra);
	}
	
	public Set<String> palabrasConLongitudN(int longitud){
		Set<String> aux = new TreeSet<>();
		aux.addAll(palabras);
		aux.removeIf(n -> (n.length())==longitud);
		return aux;
	}
	
	public void borrarPalabras() {
		palabras.removeAll(palabras);
	}
	
	public void reemplazarPalabras(String cadena) {
		borrarPalabras();
		añadirCadena(cadena);
	}
}
