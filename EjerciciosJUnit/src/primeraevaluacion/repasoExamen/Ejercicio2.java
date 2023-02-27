package primeraevaluacion.repasoExamen;

public class Ejercicio2 {

	public static void main(String[] args) {

		
		String [] codigo = {"Hola", "Polo", "Casi", "Holo","holaa"};
		
		System.out.println(distanciaCodigo(codigo));
		
	}


	
	private static int distanciaHamming(String s1, String s2) {
		if(s1.length()!=s2.length())
			return -1;
		int contador = 0;
		for(int i=0; i<s1.length();i++)
			if(s1.charAt(i) != s2.charAt(i))
				contador++;
		return contador;
				
	}
	
	private static int distanciaCodigo(String[] codigo) {
		int min=Integer.MAX_VALUE;
		int d;
		for(int i = 0; i<codigo.length-1; i++)
			for(int j=i+1;j<codigo.length;j++) {
				d = distanciaHamming(codigo[i], codigo[j]);
				if (d<min)
					min = d;
			}
		return min;
	}
}
