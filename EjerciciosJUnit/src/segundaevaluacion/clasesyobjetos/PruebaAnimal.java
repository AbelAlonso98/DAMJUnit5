package segundaevaluacion.clasesyobjetos;

import java.time.LocalDate;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal animal1 = new Animal("pepito", LocalDate.of(2017, 5, 23));
		Animal animal2 = new Animal("pepote");
		System.out.println(animal1);
		System.out.println(animal2);
	}

}
