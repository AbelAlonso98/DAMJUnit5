package primeraevaluacion.repasoExamen;

import java.util.Scanner;

public class Ejercicios1 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char [] tablero = new char[8];
		

		

		int puntuacionJ1=0;
		int puntuacionJ2=0;
		while(puntuacionJ1<15 || puntuacionJ2<15) {
			boolean entradaValida = false;
			System.out.println("Jugador 1:");
			while (entradaValida == false){
				if(validarEntrada(sc.nextInt())) {
					System.out.println("Entrada no válida");
					sc.nextInt();
				}

				else { 
					entradaValida=true;
					puntuacionJ1+=sc.nextInt();
					}
			}
			entradaValida=false;
			System.out.println("Jugador 2:");
			while (entradaValida == false){
				if(validarEntrada(sc.nextInt()))
					System.out.println("Entrada no válida");
				else { 
					entradaValida=true;
					puntuacionJ2+=sc.nextInt();
					}
			}
		
			
			sc.close();
		}

	}
	
	private static boolean validarEntrada(int i) {
		if(i>9||i<=0)
			return true;
		else
			return false;
	}

}
