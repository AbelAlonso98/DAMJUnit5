package segundaevaluacion.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class EjerciciosStreamsLemario {

	public static void main(String[] args) throws IOException {
		List<String> lemario;
		lemario = Files.readAllLines(Paths.get("recursos", "lemario-general-del-espanol.txt"));

		// Ejercicio 1: mostrar en la pantalla las palabras que empiezan por las letras
		// de la 'a' a la 'm'
		// lemario.stream().filter((s) ->
		// s.matches("^[a-m].*$")).forEach(System.out::println);

		// Ejercicio 2: agrupar las palabras que comienzan por los mismos tres
		// caracteres (solo las de longitud mayor que 3)

//		Map<String, List<String>> mapa = new TreeMap<>();
//		for (String s : lemario) {
//			if (s.length() > 3) {
//				String clave = s.substring(0, 3);
//				List<String> lista = mapa.computeIfAbsent(clave, k -> new LinkedList<String>());
//				lista.add(s);
//				}
//		}
//		mapa.forEach((k, v) -> System.out.println(k + " (" + k.length() + "): " + v ));

		// Ejercicio 2 (con Streams):
//		Map<String, List<String>> mapa2 = new TreeMap<>();
//		mapa2 = lemario.stream().filter(s -> s.length() > 3).collect(Collectors.groupingBy((s) -> s.substring(0, 3)));
//		mapa2.forEach((k, v) -> System.out.println(k + " (" + k.length() + "): " + v));
		
		// Ejercicio 3: encontrar los palindromos y almacenarlos en una lista.
//		List<String> palindromos = lemario.stream().filter(s -> isPalindrome(s)).collect(Collectors.toList());
//		System.out.println(palindromos);
//		
		// Ejercicio 4: contar el numero de palabras en las que aparece cada letra de la 'a' a la 'z'
		Map<String, List<String>> mapa3 = new TreeMap<>();
		char [] cc = new char[1];
		for(char c='a'; c<='z';c++) {
			cc[0] = c;
			System.out.println(c + ": " + lemario.stream().filter(s -> s.contains(String.valueOf(cc[0]))).count());
		}
		
		lemario.stream().
	}
	public static boolean isPalindrome(String str)
    {
        // Initializing an empty string to store the reverse
        // of the original str
        String rev = "";
 
        // Initializing a new boolean variable for the
        // answer
        boolean ans = false;
 
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
 
        // Checking if both the strings are equal
        if (str.equals(rev)) {
            ans = true;
        }
        return ans;
    }


}
