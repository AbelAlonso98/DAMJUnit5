package segundaevaluacion.referenciasMetodos;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MiClase {

	public static void main(String[] args) {
		List<String> lista = List.of("a", "b", "c", "d", "e");

//		Imprimir cada elemento en una linea separada, utilizando el metodo
//		for each, que tiene como parametro un objeto consumer. Para ello creamos
//		una clase que implemente la interface Consumer, parametrizandola a 
//		Strings y haciendo que su metodo accept() haga un println.
		MiConsumer c = new MiConsumer();
		lista.forEach(c);

//		Otras formas de usar la interfaz consumer sin instanciarlo.
		System.out.println("--------------------------");
		lista.forEach(new Consumer<String>() {
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
		});

//		Lo mismo pero con una expresion lambda
		System.out.println("--------------------------");
		lista.forEach(s -> System.out.println(s));

//		Haciendo referencia a un metodo
		System.out.println("--------------------------");
		lista.forEach(System.out::println);

//		Haciendo referencia a un metodo de mi propia clase
		System.out.println("--------------------------");
		lista.forEach(MiClase::metodo);

//		Expresion lambda con un metodo de la propia clase
		System.out.println("--------------------------");
		lista.forEach(s -> metodo(s));

	}

	static void metodo(String s) {
		System.out.println(s);
	}

}
