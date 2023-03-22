package segundaevaluacion.mapas;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio2 {

	public static void main(String[] args) {
		String[] array = { "hola", "que", "que", "tal", "123456", "aaaaaaaa" };

		long startTime = System.nanoTime();
		System.out.println(wordLen(array).toString());
		long endTime = System.nanoTime();

		long duration = (endTime - startTime);
		System.out.println(duration);
		startTime = System.nanoTime();
		System.out.println(wordLen2(array).toString());
		endTime = System.nanoTime();

		duration = (endTime - startTime);
		System.out.println(duration);

		startTime = System.nanoTime();
		System.out.println(wordLen3(array).toString());
		endTime = System.nanoTime();

		duration = (endTime - startTime);
		System.out.println(duration);

	}

	public static Map<String, Integer> wordLen(String[] strings) {
		return Stream.of(strings).distinct().collect(Collectors.toMap(t -> t, i -> i.length()));

	}

	public static Map<String, Integer> wordLen2(String[] strings) {
		Map<String, Integer> map = new TreeMap<>();
		Stream.of(strings).forEach(s -> map.put(s, s.length()));
		return map;
	}

	public static Map<String, Integer> wordLen3(String[] strings) {
		Map<String, Integer> map = new TreeMap<>();
		for (String s : strings)
			map.put(s, s.length());
		return map;
	}

}
