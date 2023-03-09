package primeraevaluacion.colecciones;

import java.util.*;

public class Palabras {
    private Set<String> palabrasUnicas;
    private Map<Integer, Set<String>> palabrasPorLongitud;

    public Palabras() {
        palabrasUnicas = new HashSet<>();
        palabrasPorLongitud = new HashMap<>();
    }

    public Palabras(String cadena) {
        palabrasUnicas = new HashSet<>();
        palabrasPorLongitud = new HashMap<>();
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
}
