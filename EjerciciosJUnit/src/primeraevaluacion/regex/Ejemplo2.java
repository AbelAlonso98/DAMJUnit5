package primeraevaluacion.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejemplo2 {

	private static String s = "James,Butt,\"Benton, John B Jr\",6649 N Blue Gum St,New Orleans,Orleans,LA,70116,504-621-8927,504-845-1427,jbutt@gmail.com\r\n"
			+ "Josephine,Darakjy,\"Chanay, Jeffrey A Esq\",4 B Blue Ridge Blvd,Brighton,Livingston,MI,48116,810-292-9388,810-374-9840,josephine_darakjy@darakjy.org\r\n"
			+ "Art,Venere,\"Chemel, James L Cpa\",8 W Cerritos Ave #54,Bridgeport,Gloucester,NJ,8014,856-636-8749,856-264-4130,art@venere.org\r\n"
			+ "Lenna,Paprocki,Feltz Printing Service,639 Main St,Anchorage,Anchorage,AK,99501,907-385-4412,907-921-2010,lpaprocki@hotmail.com\r\n"
			+ "Donette,Foller,Printing Dimensions,34 Center St,Hamilton,Butler,OH,45011,513-570-1893,513-549-4561,donette.foller@cox.net\r\n"
			+ "Simona,Morasca,\"Chapman, Ross E Esq\",3 Mcauley Dr,Ashland,Ashland,OH,44805,419-503-2484,419-800-6759,simona@morasca.com\r\n"
			+ "Mitsue,Tollner,Morlong Associates,7 Eads St,Chicago,Cook,IL,60632,773-573-6914,773-924-8565,mitsue_tollner@yahoo.com";
	public static void main(String[] args) {
		//System.out.println(s);
		/*Pattern regex = Pattern.compile("[^,^@]+@[a-z0-9]+.[a-z]+");*/
		Pattern regex2 = Pattern.compile("(\\w+(?:\\.\\w+)*)@\\w+(?:\\.\\w+)+");

		
		/*Matcher m = regex.matcher(s);*/
		Matcher m2 = regex2.matcher(s);
//		System.out.println("Regex 1");
//		while(m.find()) {
//			System.out.println(m.group());
//		}
		//System.out.println("Regex 2");
		while(m2.find()) {
			/*System.out.println(m2.group());*/
			int numGrupos = m2.groupCount();
			for(int i=0; i <= numGrupos; i++) {
				System.out.println(m2.group(i));
			}
			System.out.println();
		}



	}

}