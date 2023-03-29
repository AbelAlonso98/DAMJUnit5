package segundaevaluacion.entregable1;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Palabras {
    private Set<String> palabrasUnicas;
    private Map<Integer, Set<String>> palabrasPorLongitud;

    public Palabras() {
        palabrasUnicas = new HashSet<>();
        palabrasPorLongitud = new TreeMap<>();
    }

    public Palabras(String cadena) {
        palabrasUnicas = new HashSet<>();
        palabrasPorLongitud = new TreeMap<>();
        agregarPalabras(cadena);
    }

    public void agregarPalabra(String palabra) {
        if (!palabrasUnicas.contains(palabra)) {
            palabrasUnicas.add(palabra);
            int longitud = palabra.length();
            Set<String> palabrasDeLongitud = palabrasPorLongitud.getOrDefault(longitud, new TreeSet<>());
            palabrasDeLongitud.add(palabra);
            palabrasPorLongitud.put(longitud, palabrasDeLongitud);
        }
    }

    public void agregarPalabras(String cadena) {
        String[] palabras = cadena.split("\\s+");
        for (String palabra : palabras) {
            agregarPalabra(palabra);
        }
    }

    public boolean contienePalabra(String palabra) {
        return palabrasUnicas.contains(palabra);
    }

    public Set<String> obtenerPalabrasDeLongitud(int longitud) {
        return palabrasPorLongitud.getOrDefault(longitud, new TreeSet<>());
    }

    public void borrarPalabras() {
        palabrasUnicas.clear();
        palabrasPorLongitud.clear();
    }

    public void borrarPalabras(String cadena) {
        borrarPalabras();
        agregarPalabras(cadena);
    }
    
    public void mostrarPalabras() {
    	palabrasUnicas.stream().sorted().forEach(s -> System.out.println(s));
    }
    
    
}
