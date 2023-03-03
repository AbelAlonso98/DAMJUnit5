package segundaevaluacion.clasesyobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Mazo {

	private static Random r = new Random();
	private ArrayList<Naipe> naipes = new ArrayList<>();
	
	public Mazo() {
		agregarBaraja();
	}
	
	public Mazo(int n) {
		for (int i=0; i<n; i++)
			agregarBaraja();
	}
	
	
	public void agregarBaraja() {
		for (Palos palo: Palos.values()) 
			for (Rangos rango: Rangos.values())
				naipes.add(new Naipe(palo, rango));
	}
	
	public Naipe get() {
		return naipes.get(r.nextInt(naipes.size()));
	}
	
	public Naipe remove() {
		int i = r.nextInt(naipes.size());
		Naipe naipe = naipes.get(i);
		naipes.remove(i);
		return naipe;
	}
	
	public void add(Naipe naipe) {
		naipes.add(naipe);
	}
	
	public void addAll(Mazo mazo) {
		naipes.addAll(mazo.naipes);
		mazo.naipes.clear();
	}
	
	public List<Naipe> getNaipes() {
		return Collections.unmodifiableList(naipes);
	}
	
	public static void main(String[] args) {
		Mazo mazo = new Mazo();
		System.out.println(mazo.getNaipes());
	}
	
}
