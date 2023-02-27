package primeraevaluacion.colecciones2;

import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class Colecciones {

	public static void main(String[] args) {
//		Set<String> cadenas = new HashSet<>();
//		cadenas.add("uno");
//		cadenas.add("hola");
//		cadenas.add("que");
//		cadenas.add("tu");
//		cadenas.add("yo");
//		System.out.println(cadenas);
//		eliminarLasDeLongitudPar(cadenas);
//		System.out.println(cadenas);

//		Set<Integer> numeros = new HashSet<>();
//		numeros.add(2);
//		numeros.add(4);
//		numeros.add(6);
//		System.out.println(numeros);
//		System.out.println(contieneImpares(numeros));

//		System.out.println(contieneImpares2(Set.of(1, 2, 3, 4, 5, 6)));
//		Set<Integer> numeros2 = new HashSet<>();
//		numeros2.add(1);
//		numeros2.add(4);
//		numeros2.add(6);
//		System.out.println(numeros2);
//		System.out.println(contieneImpares(numeros2));

//		Map<String, String> m = new TreeMap<String, String>();
//		m.put("11111111", "Elena Fernández");
//		m.put("11222333", "Carlos González");
//		m.put("11444555", "Rodrigo Rodíguez");
//		m.put("11321123", "Elena Fernández");
//		m.put("11777999", "Pilar Ramos");
//		System.out.println(m);
//		System.out.println(valoresUnicos(m));
//		Deque<Integer> pila = new ArrayDeque<>();
//		List.of(3, 1, -5, 4, -2, 7).forEach(n -> pila.push(n));
//		System.out.println(pila);
//		negativosAbajoPositivosArriba2(pila);
//		System.out.println(pila);

//		Map<String, String> mapa = new HashMap<>();
//		mapa.put("1", "1");
//		mapa.put("2", "2");
//		mapa.put("3", "3");
//		System.out.println(valoresUnicos(mapa));
//		System.out.println(valoresUnicos2(mapa));
		
		List<String> lista = new ArrayList<>();
		lista.add("hola");
		lista.add("hola");
		lista.add("que");
		lista.add("estas");
		System.out.println(algunaSeRepiteAlMenos3Veces(lista));

	}

	public static void eliminarLasDeLongitudPar(Set<String> cadenas) {
		cadenas.removeIf(n -> (n.length() % 2 == 0));
	}

	public static void eliminarLasDeLongitudPar2(Set<String> cadenas) {
		Iterator<String> i = cadenas.iterator();
		while (i.hasNext()) {
			if (i.next().length() % 2 == 0)
				i.remove();
		}
	}

	public static boolean contieneImpares(Set<Integer> numeros) {
		Set<Integer> aux = numeros;
		return aux.removeIf(n -> (n % 2 != 0));
	}

	public static boolean contieneImpares2(Set<Integer> numeros) {
		for (int n : numeros)
			if (n % 2 == 1)
				return true;
		return false;
	}

	public static boolean contieneImpares3(Set<Integer> numeros) {
		return numeros.stream().anyMatch(n -> n % 2 != 0);
	}

	public static boolean valoresUnicos(Map<String, String> mapa) {
		Set<String> valores = new HashSet<>(mapa.values());
		return mapa.values().size() > valores.size();

	}

	public static boolean valoresUnicos2(Map<String, String> mapa) {
		return mapa.values().stream().distinct().count() != mapa.values().size();

	}

	public static boolean algunaSeRepiteAlMenos3Veces(List<String> cadenas) {
		Map<Integer, String> mapa = new HashMap<>();
		for(int i = 0; i < cadenas.size(); i++)
			mapa.put(i, cadenas.get(i));

		int contador=0;
		for(int n: mapa.keySet()) {
			for(String s: mapa.values()) {
				if(mapa.get(n).equals(s))
					contador++;
			}
			if(contador>=3)
				return true;
			contador=0;
		}
		return false;
	}
//	public static boolean algunaSeRepiteAlMenos3Veces2(List<String> cadenas) {
//		Map<Integer, String> mapa = new HashMap<>();
//		for(int i = 0; i < cadenas.size(); i++)
//			mapa.put(i, cadenas.get(i));
//		for(String s: mapa.values())
//			
//		mapa.values().stream().
//		return false;
//	}

	public static void negativosAbajoPositivosArriba(Deque<Integer> pila) {
//		Queue<Integer> cola = new PriorityQueue<>();
//		Deque<Integer> pilaAux = new ArrayDeque<>();
//		pilaAux.add(pila.pop());
//		for (Integer i : pila) {
//			if (pilaAux.peek() > pila.peek()) {
//				cola.addAll(pilaAux);
//				for(Integer j : pila)
//					pila.remove();
//				pilaAux.add(pila.peek());
//				for(Integer k : pilaAux)
//			}
//		}

	}

	public static void negativosAbajoPositivosArriba2(Deque<Integer> pila) {
		Queue<Integer> colaPos = new LinkedList<>();
		Queue<Integer> colaNeg = new LinkedList<>();
		while (!pila.isEmpty()) {
			int n = pila.pop();
			if (n < 0)
				colaNeg.offer(n);
			else
				colaPos.offer(n);
		}
		while (!colaPos.isEmpty())
			pila.push(colaPos.poll());
		while (!colaNeg.isEmpty())
			pila.push(colaNeg.poll());

	}

}
