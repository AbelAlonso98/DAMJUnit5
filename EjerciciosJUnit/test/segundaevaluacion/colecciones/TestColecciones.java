package segundaevaluacion.colecciones;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

class TestColecciones {

	@Test
	void testEliminarLasDeLongitudPar() {
		// Test general de funcionamiento correcto
		Set<String> set = new HashSet<>(Set.of("aa", "bbb", "ccc", "dddd", "eeeee"));
		Colecciones.eliminarLasDeLongitudPar(set);
		assertEquals(Set.of("bbb", "ccc", "eeeee"), set);

		// Pasar null como parametro (lanza excepcion)
		assertThrows(NullPointerException.class, () -> Colecciones.eliminarLasDeLongitudPar(null));

		// Coleccion vacia
		set.clear();
		Colecciones.eliminarLasDeLongitudPar(set);
		assertEquals(0, set.size());

		// Todo son pares
		set = new HashSet<>(Set.of("aa", "bbbb", "cccccc"));
		Colecciones.eliminarLasDeLongitudPar(set);
		assertEquals(0, set.size());

		// Todo son impares
		set = new HashSet<>(Set.of("a", "bbb", "ccccc"));
		Colecciones.eliminarLasDeLongitudPar(set);
		assertEquals(Set.of("a", "bbb", "ccccc"), set);

		// Cadena vacia (deberia borrarla)
		set = new HashSet<>(Set.of(""));
		Colecciones.eliminarLasDeLongitudPar(set);
		assertEquals(0, set.size());

		// Alguno de los elementos es null (no funciona en TreeSet)
		final Set<String> setf = new HashSet<>(Set.of("a", "bbbb"));
		setf.add(null);
		Set<String> setf2 = new HashSet<>(setf);
		assertEquals(setf, setf2);
	}

	@Test
	void testContieneImpares() {
		// Comprobar su correcto funcionamiento
		Set<Integer> set = new HashSet<>(Set.of(1, 2, 3, 4, 5));
		assertTrue(Colecciones.contieneImpares(set));
		set = new HashSet<>(Set.of(2, 4, 6));
		assertFalse(Colecciones.contieneImpares(set));
		
		// Comprobar si funciona con un conjunto vacio
		set.clear();
		assertFalse(Colecciones.contieneImpares(set));
		
		// Le pasamos null
		assertThrows(NullPointerException.class, () -> Colecciones.contieneImpares(null));

		// La coleccion contiene null
		set = new HashSet<>(Set.of(1, 2, 3, 4, 5));
		set.add(null);
		assertTrue(Colecciones.contieneImpares(set));
		set = new HashSet<>(Set.of(2, 4, 6));
		assertFalse(Colecciones.contieneImpares(set));
		
		
	}
	
	@Test
	void testValoresUnicos() {
		// Comprobar el valor adecuado
		Map<String, String> mapa = new HashMap<>();
		mapa.put("1", "1");
		mapa.put("2", "2");
		mapa.put("3", "3");
		mapa.put("4", "4");
		assertFalse(Colecciones.valoresUnicos(mapa));
		mapa.put("5", "1");
		assertTrue(Colecciones.valoresUnicos(mapa));
		
		// El mapa contiene un valor null
		mapa.put("6", null);
		assertTrue(Colecciones.valoresUnicos(mapa));
		
		// El mapa contiene una clave null
		mapa.put(null, "5");
		assertTrue(Colecciones.valoresUnicos(mapa));
		
		// Le pasamos null como paramentro
		assertThrows(NullPointerException.class, () -> Colecciones.valoresUnicos(null));
	}
	
	@Test
	void testAlgunaSeRepiteAlMenos3Veces() {
		// Funcionamiento correcto con lista que cumple los requisitos
		List<String> cadenas2 = Stream.of("a", "b", "a", "c" ,"a").collect(Collectors.toList());
		List<String> cadenas = List.of("a", "b", "a", "c" ,"a");
		assertTrue(Colecciones.algunaSeRepiteAlMenos3Veces(cadenas));
		assertTrue(Colecciones.algunaSeRepiteAlMenos3Veces(cadenas2));
		
		// Funcionamiento correcto con lista que no cumple los requisitos
		cadenas = List.of("a", "b", "a", "c" );
		cadenas2.remove("a");
		assertFalse(Colecciones.algunaSeRepiteAlMenos3Veces(cadenas));
		assertFalse(Colecciones.algunaSeRepiteAlMenos3Veces(cadenas2));
		
		// Lista vacia
		cadenas = List.of();
		assertFalse(Colecciones.algunaSeRepiteAlMenos3Veces(cadenas));
		
		// Le pasamos null como parametro
		assertThrows(NullPointerException.class, () -> Colecciones.algunaSeRepiteAlMenos3Veces(null));
	}
	
	@Test
	void testNegativosAbajoPositivosArriba() {
		Deque<Integer> pila = new ArrayDeque<>(List.of(3, 1, -5, 4, -2, 7));
		System.out.println(pila);
		Colecciones.negativosAbajoPositivosArriba(pila);
		System.out.println(pila);
		pila.clear();
	}
	


}
