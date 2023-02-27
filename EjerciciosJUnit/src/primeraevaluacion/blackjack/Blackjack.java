package primeraevaluacion.blackjack;

import java.util.List;

public class Blackjack {
	private static Mazo ManoCrupier = new Mazo();
	private static Mazo ManoJugador;
	public static void main(String[] args) {
		Repartir();

	}
	
	public static boolean Repartir() {
		List<Naipe> naipes = ManoCrupier.getNaipes();
		for(Naipe n: naipes)
			System.out.println(n.getRango()+" "+n.getPalo());
		
		
		ManoJugador.add(ManoCrupier.remove());
		naipes = ManoJugador.getNaipes();
		System.out.println("\n------------------------------------------\n");
		List<Naipe> naipesJ = ManoCrupier.getNaipes();
		for(Naipe n2: naipesJ)
			System.out.println(n2.getRango()+" "+n2.getPalo());
		System.out.println("\n------------------------------------------\n");
		
		for(Naipe n: naipes)
			System.out.println(n.getRango()+" "+n.getPalo());
		
		
		return false;
	}

}
