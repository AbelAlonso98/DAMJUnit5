package primeraevaluacion.repasoExamen;

public class Ejercicio3 {

	public static void main(String[] args) {
		String s1 = "zipXzap";
		String s2 = "zopzop";
		String s3 = "zzzopzop";
		
		System.out.println("zipZap");
		System.out.println(zipZap(s1));
		System.out.println(zipZap(s2));
		System.out.println(zipZap(s3)+"\n");
		
		System.out.println("zipZap2");
		System.out.println(zipZap2(s1));
		System.out.println(zipZap2(s2));
		System.out.println(zipZap2(s3));
		
	}
	
	
	private static String zipZap(String str) {
		return str.replaceAll("z.p", "zp");
	}
	
	private static String zipZap2(String str) {
		str.toLowerCase();
		StringBuilder resultado = new StringBuilder();
		
		if(str.length() <3)
			return str;
		for (int i=0;i<str.length(); i++) {
			if(str.toLowerCase().charAt(i)=='z') {
				if(i<=str.length()-2 && str.toLowerCase().charAt(i+2) == 'p') {
					resultado.append("zp");
					i+=2;
			}
				else
					resultado.append(str.charAt(i));
			}
			else
				resultado.append(str.charAt(i));	
				
		}			
		return resultado.toString();
	}

}
