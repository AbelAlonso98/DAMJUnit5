package primeraevaluacion.repasoExamen;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Primera palabra: ");
		String s1 = sc.next();
		System.out.println("Segunda palabra: ");
		String s2 = sc.next();
		System.out.print(endOther(s1, s2));
		System.out.println();
		System.out.print(endOther(s1, s2));
		sc.close();
	}
	
	private static boolean endOther(String a, String b) {
		a= a.toLowerCase();
		b= b.toLowerCase();
		return ((a.lastIndexOf(b) == (a.length() - b.length()) || (b.lastIndexOf(a) == (b.length() - a.length()))));
		
		
	}

	
	@SuppressWarnings("unused")
	private static boolean endOther2(String a, String b) {
		
		return a.endsWith(b) || b.endsWith(a);
	}
}
