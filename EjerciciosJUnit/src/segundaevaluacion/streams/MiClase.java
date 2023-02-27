package segundaevaluacion.streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class MiClase {

	public static void main(String[] args) {
		List<String> lista = List.of("a", "bb", "cdde", "ddd", "easdfgl");
		
//		Usando el forEach de Stream
		System.out.println("\n---------------------------------1---------------------------------");
		lista.stream().forEach(s -> System.out.println(s.toUpperCase()));
		
//		Mapeando el stream
		System.out.println("\n---------------------------------2---------------------------------");
		lista.stream().map(s -> s.toUpperCase()).forEach(s -> System.out.println(s));

//		Mapeando el stream usando referencias a metodos
		System.out.println("\n---------------------------------3---------------------------------");
		lista.stream().map(String::toUpperCase).forEach(System.out::println);
		
//		Imprimir solo las de longitud par
		System.out.println("\n---------------------------------4---------------------------------");
		lista.stream().filter(s -> s.length()%2==0).forEach(s -> System.out.println(s.toUpperCase()));
		
//		Usando referencias a metodos
		System.out.println("\n---------------------------------5---------------------------------");
		lista.stream().filter(MiClase::esPar).forEach(System.out::println);
		
//		Mostrar por pantalla los primeros 20 enteros positivos
		System.out.println("\n---------------------------------6---------------------------------");
		Stream.iterate(0, i -> ++i).limit(20).forEach(s -> System.out.println(s));
		
//		Mostrar por pantalla los 20 primeros imparesm  bjb 
		System.out.println("\n---------------------------------7---------------------------------");
		Stream.iterate(0, i -> ++i).filter(s -> s%2==1).limit(20).forEach(s -> System.out.println(s));
//		Stream.generate(() -> new Random().nextInt(10)).limit(10).forEach(s -> System.out.println(s));
		
	}
	
	public static boolean esPar(String s) {
		return s.length()%2==0;
	}
	
	

}
