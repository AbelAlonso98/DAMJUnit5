package primeraevaluacion.electrodomesticos;

import java.util.ArrayList;

public class PruebaElectrodomesticos {

	public static void main(String[] args) {
		ArrayList<Electrodomestico> electrodomesticos = new ArrayList<>();
		Frigorifico frigorifico = new Frigorifico(100, 50f);
		Lavadora lavadora = new Lavadora(50, 30f, 7);
		Television television = new Television(10f, 25);
		electrodomesticos.add(frigorifico);
		electrodomesticos.add(lavadora);
		electrodomesticos.add(television);
		for(Electrodomestico e: electrodomesticos) {
			System.out.println(e);
		}

	}

}
