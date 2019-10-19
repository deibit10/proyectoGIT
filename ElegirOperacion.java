/*
*	@author	David Sánchez López
*/
import java.util.Scanner;

public class U2Actividad3DSL{
	public static void main (String []args){
		Scanner teclado = new Scanner(System.in);

		System.out.print("Introduce el año: ");
		int year = teclado.nextInt();	
		int resto = year % 12;
		String horoscopo = "";
		switch(resto){
			case 0: horoscopo = "Mono";
			break;
			case 1: horoscopo = "Gallo";
			break;
			case 2: horoscopo = "Perro";
			break;
			case 3: horoscopo = "Cerdo";
			break;
			case 4: horoscopo = "Rata";
			break;
			case 5: horoscopo = "Buey";
			break;
			case 6: horoscopo = "Tigre";
			break;
			case 7: horoscopo = "Conejo";
			break;
			case 8: horoscopo = "Dragón";
			break;
			case 9: horoscopo = "Serpiente";
			break;
			case 10: horoscopo = "Caballo";
			break;
			case 11: horoscopo = "Oveja";
			break;
			default: System.out.println("Error");
		}
		if(resto >= 0 && resto < 12)
		System.out.println("Tu horoscopo chino corresponde a " + horoscopo);
	}
}