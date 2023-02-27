package segundaevaluacion.colecciones;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;

public class Colecciones {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(4);
		lista.add(2);
		lista.add(2);
		lista.add(3);
		lista.add(8);
		lista.add(1);
		System.out.println(moda(lista));

	}

	/**
	 * Metodo que elimina de un conjunto de String todas aquellas cadenas con
	 * longitud par.
	 * 
	 * @param La lista de cadenas a procesar.
	 */
	public static void eliminarLasDeLongitudPar(Set<String> cadenas) {
		cadenas.removeIf(n -> n != null && (n.length() % 2 == 0));
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
		return aux.removeIf(n -> n != null && (n % 2 != 0));
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
		for (int i = 0; i < cadenas.size(); i++)
			mapa.put(i, cadenas.get(i));

		int contador = 0;
		for (int n : mapa.keySet()) {
			for (String s : mapa.values()) {
				if (mapa.get(n).equals(s))
					contador++;
			}
			if (contador >= 3)
				return true;
			contador = 0;
		}
		return false;
	}

	public static boolean algunaSeRepiteAlMenos3Veces2(List<String> cadenas) {
		Map<String, Integer> mapa = new HashMap<>();
		for (String s : cadenas) {
			if (mapa.containsKey(s)) {
				int n = mapa.put(s, mapa.get(s) + 1);
				if (n == 3)
					return true;
			} else
				mapa.put(s, 1);
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

	public static Map<String, Integer> interseccion(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
		Map<String, Integer> mapa = new HashMap<>();

		for (String s : mapa1.keySet())
			if (mapa2.containsKey(s) && mapa2.get(s).equals(mapa1.get(s)))
				mapa.put(s, mapa1.get(s));

		return mapa;
	}

	public static Map<String, Integer> interseccion2(Map<String, Integer> mapa1, Map<String, Integer> mapa2) {
		Map<String, Integer> mapa = new HashMap<>();
		Set<String> set = mapa1.keySet();
		set.retainAll(mapa2.keySet());
		for (String s : set)
			mapa.put(s, mapa1.get(s));
		return mapa;
	}

	public static int moda(List<Integer> lista) {
		if (lista.isEmpty())
			return 0;
		Map<Integer, Integer> mapa = new TreeMap<>();
		for (Integer s : lista) {
			if (mapa.containsKey(s)) {
				mapa.put(s, mapa.get(s) + 1);
			} else
				mapa.put(s, 1);
		}
		// @TODO sacar la key del valor maximo
		return Collections.max(mapa.values());

	}

}
