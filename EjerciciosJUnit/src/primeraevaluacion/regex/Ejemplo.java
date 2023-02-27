package primeraevaluacion.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo {

	private static String s = "xyzactmaacbfgh";
	public static void main(String[] args) {
		Pattern regex = Pattern.compile("a+cb*");
		Matcher m = regex.matcher(s);
		System.out.println("Resultado de matches():");
		System.out.println(m.matches());
//		m.reset();
		System.out.println("Resultado de find():");
		while(m.find())
			System.out.println(m.group());


	}

}
