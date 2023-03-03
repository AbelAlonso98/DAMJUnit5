package segundaevaluacion.pruebas;

import java.util.Set;
import java.util.TreeSet;

public class OtraClase {

	public static void main(String[] args) {
		String[] strings = new String[] { "esto", "es", "una", "prueba" };

		System.out.println(strings[2].compareTo(strings[0]));
		
//		Arrays.sort(strings);
//		System.out.println(Arrays.toString(strings));
		
		Set<String> c = new TreeSet<>(Set.of(strings));
		System.out.println(c);
		c.add("una");
		System.out.println(c);
	}

}
