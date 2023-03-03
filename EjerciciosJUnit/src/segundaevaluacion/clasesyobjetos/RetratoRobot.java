package segundaevaluacion.clasesyobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RetratoRobot {

	private static ArrayList<String> rasgosPelo = new ArrayList<>();
	private static ArrayList<String> rasgosOjos = new ArrayList<>();
	private static ArrayList<String> rasgosNariz = new ArrayList<>();
	private static ArrayList<String> rasgosBoca = new ArrayList<>();
	private static ArrayList<String> rasgosBarbilla = new ArrayList<>();
	
	static {
		rasgosPelo.add("WWWWWWWWW");
		rasgosPelo.add("\\\\\\//////");
		rasgosPelo.add("|\"\"\"\"\"\"\"|");
		rasgosPelo.add( "|||||||||");
		rasgosOjos.add("|  O O  |");
		rasgosOjos.add("|-(· ·)-|");
		rasgosOjos.add("|-(o o)-|");
		rasgosOjos.add("|  \\ /  |");
		rasgosNariz.add("@   J   @");
		rasgosNariz.add("{   \"   }");
		rasgosNariz.add("[   j   ]");
		rasgosNariz.add("<   -   >");
		rasgosBoca.add("|  ===  |");
		rasgosBoca.add("|   -   |");
		rasgosBoca.add("|  ___  |");
		rasgosBoca.add("|  ---  |");
		rasgosBarbilla.add(" \\_____/ ");
		rasgosBarbilla.add(" \\,,,,,/ ");
	}
	
	public static final int numFacciones = 5;
	
	
	
	private int pelo;
	private int ojos;
	private int nariz;
	private int boca;
	private int barbilla;
	 
	 public RetratoRobot(int pelo, int ojos, int nariz, int boca, int barbilla) {
		this.pelo = pelo;
		this.ojos = ojos;
		this.nariz = nariz;
		this.boca = boca;
		this.barbilla = barbilla;
	}
	
	public String getPelo() {
		return rasgosPelo.get(pelo);
	}



	public void setPelo(int pelo) {
		this.pelo = pelo;
	}



	public String getOjos() {
		return rasgosOjos.get(ojos);
	}



	public void setOjos(int ojos) {
		this.ojos = ojos;
	}



	public String getNariz() {
		return rasgosNariz.get(nariz);
	}



	public void setNariz(int nariz) {
		this.nariz = nariz;
	}



	public String getBoca() {
		return rasgosBoca.get(boca);
	}



	public void setBoca(int boca) {
		this.boca = boca;
	}

	public static List<String> getRasgosPelo() {
		return Collections.unmodifiableList(rasgosPelo);
	}
	
	public static List<String> getRasgosOjos() {
		return Collections.unmodifiableList(rasgosOjos);
	}
	
	public static List<String> getRasgosNariz() {
		return Collections.unmodifiableList(rasgosNariz);
	}
	
	public static List<String> getRasgosBoca() {
		return Collections.unmodifiableList(rasgosBoca);
	}
	
	public static List<String> getRasgosBarbilla() {
		return Collections.unmodifiableList(rasgosPelo);
	}

	public String getBarbilla() {
		return rasgosBarbilla.get(barbilla);
	}

	public void setBarbilla(int barbilla) {
		this.barbilla = barbilla;
	}

	public static void addRasgoPelo(String rasgo) {
		rasgosPelo.add(rasgo);
	}
	
	public static void addRasgoOjos(String rasgo) {
		rasgosOjos.add(rasgo);
	}
	
	public static void addRasgoNariz(String rasgo) {
		rasgosNariz.add(rasgo);
	}
	
	public static void addRasgoBoca(String rasgo) {
		rasgosBoca.add(rasgo);
	}
	
	public static void addRasgoBarbilla(String rasgo) {
		rasgosBarbilla.add(rasgo);
	}

	
	
	@Override
	public String toString() {
		return rasgosPelo.get(pelo) + "\n" +
			   rasgosOjos.get(ojos) + "\n" +
			   rasgosNariz.get(nariz) + "\n" +
			   rasgosBoca.get(boca) + "\n" +
			   rasgosBarbilla.get(barbilla);
	}		
}
