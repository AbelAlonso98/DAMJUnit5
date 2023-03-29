package segundaevaluacion.colecciones;

import java.util.*;
import java.util.stream.Collectors;

public class ColeccionesTesting {

	public static void main(String[] args) {
		probandoColas();
		
		

	}
	
	public static void probandoPilas() {
		Deque<String> pila = new ArrayDeque<>();
		pila.push("1");
		pila.push("2");
		pila.push("3");
		pila.push("4");
		pila.push("5");
		pila.push("6");
		pila.push("7");
		pila.push("8");
		System.out.println(pila.toString());
		pila.poll();
		System.out.println(pila.toString());
		pila.pop();
		System.out.println(pila.toString());
		Deque<String> pila2 = new ArrayDeque<>();
		while(!pila.isEmpty())
			pila2.push(pila.poll());
		System.out.println(pila.toString());
		System.out.println(pila2.toString());
	}
	
	public static void probandoColas() {
		Queue<String> cola = new LinkedList<>();
		cola.offer("B");
		cola.offer("T");
		cola.offer("A");
		cola.offer("Z");
		cola.offer("S");
		System.out.println(cola);
		cola = cola.stream().sorted().collect(Collectors.toCollection(PriorityQueue::new));
		System.out.println(cola);
	}
	
	public static void probandoColas2() {
		Queue<String> cola = new LinkedList<>();
		cola.offer("A");
		cola.offer("B");
		cola.offer("C");
		cola.offer("D");
		cola.offer("E");
		cola.offer("F");
		cola.offer("G");
		cola.offer("H");
		cola.offer("I");
		System.out.println(cola.toString());
//		cola.poll();
//		System.out.println(cola.toString());
		Queue<String> cola2 = new LinkedList<>();
		while(!cola.isEmpty()) {
			cola2.offer(cola.poll());
			System.out.println("Cola1: " + cola.toString());
			System.out.println("Cola2: " + cola2.toString());
		}
		
		
	}
	


}
