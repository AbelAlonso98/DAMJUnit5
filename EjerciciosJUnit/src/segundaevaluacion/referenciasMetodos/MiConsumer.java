package segundaevaluacion.referenciasMetodos;

import java.util.function.Consumer;

public class MiConsumer implements Consumer<String> {

	@Override
	public void accept(String t) {
		System.out.println(t);
		
	}

}
