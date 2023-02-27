package primeraevaluacion.examen;



public class Ejercicio2 {

	public static void main(String[] args)  {
		
		int min = 10;
		int max = 50;
		int tamañoArray = intAleatorio(min, max);
		double[] array = new double[tamañoArray];		
		for(int i = 0 ; i < tamañoArray; i++) {
			array[i]= intAleatorio(-1000, 1000);
		}
		//System.out.print(tamañoArray);
		System.out.println("Array: ");
		//System.out.print(Array.toString(array));
		System.out.println("\nResultado de procesar el array;: ");
		System.out.print(procesar(array));

	}
	
	static double procesar(double[] array){
		double max=0;
		for(int i=0; i < array.length; i++)
			if(max<array[i])
				max=array[i];
		
		double contador = 0;
		for(int j = 0 ; j < array.length; j++) {
			contador +=array[j];
			if(contador>(max/3))
				return contador/3;
		}
		return contador*2/3;
		
	}
	
	static char[] arrayImprimible(double[] array) {
		char[] arrayI = new char[array.length];
		for(int i = 0 ; i < array.length; i ++) {
			arrayI[i] = (char) array[i];
		}
		
		return arrayI;
		
	}
	
	static String[] arrayImprimible2(double[] array) {
		String[] arrayI = new String[array.length];
		for(int i = 0 ; i < array.length; i ++) {
			arrayI[i] = Double.toString(array[i]);
		
		}
		return arrayI;
		
	}
	
	static int intAleatorio(int min, int max) {
			  return (int) (Math.floor(Math.random() * (max - min) ) + min);
			
	}
}
