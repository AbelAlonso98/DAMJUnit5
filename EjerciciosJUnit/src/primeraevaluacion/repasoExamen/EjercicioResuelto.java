package primeraevaluacion.repasoExamen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EjercicioResuelto {

	private static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
	private static char[] elegidos = new char[9];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		boolean ganador=false;
		while(!ganador) {
			int sumaA = 0;
			int sumaB = 0;
			for(int i = 0; i < elegidos.length;i++)
				elegidos[i]=0;
			System.out.println("Partida iniciada");
			for(int i=0;i<3;i++) {
				System.out.printf("Jugador A (%d) elige: ", sumaA);
				sumaA += elegir('A');
				if (i==2 && sumaA==15) {
					System.out.println("JUGADOR A GANA LA PARTIDA");
					ganador=true;
				}
				
				else {
					System.out.printf("Jugador B (%d) elige: ", sumaB);
					sumaB += elegir('B');
					if(i==2 && sumaB==15) {
						System.out.println("JUGADOR B GANA LA PARTIDA");
						ganador=true;
						}
						
				}

			}
			if(sumaA!=15 && sumaB!=15)
				System.out.println("A Y B PIERDEN\n");
			ganador=true;
				
		}
	}
	
	private static int elegir(char jugador) throws IOException {
		int n = 0;
		boolean correcto = false;
		while(!correcto) {
			try{
				n = Integer.parseInt(in.readLine());
				if(n>=1 && n<=9 && elegidos[n-1]==0)
					correcto = true;
				else
					System.out.println("El número ya está elegido o no es correcto.");
			}catch(NumberFormatException e){
				System.out.println("La entrada ha de ser un número.");
			}
			if(!correcto)
				System.out.println("Elige de nuevo: ");
		}
		elegidos[n-1]=jugador;
		
		
		
		
		return n;
		
	}

}
