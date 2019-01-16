package sentenciaSwitch;

import java.util.Scanner;

public class PruebaSwitch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un entero entre 1 y 10");
		String sEntero = sc.nextLine();
		int i = Integer.parseInt(sEntero);
		
		switch (i) {
		case 1:
			System.out.println("una estrella *");
			break;
		case 2:
			System.out.println("dos estrellas **");
			break;
		case 3:
			System.out.println("tres estrellas ***");
			break;
		case 4:
			System.out.println("cuatro estrellas ****");
			break;
		case 5:
			System.out.println("cinco estrellas *****");
			break;
		case 6:
		case 7:
			System.out.println(i + " estrellas todavía me las puedo creer");
			break;
		default:
			System.out.println(i + " estrellas son muchas");
			break;
		}
		
		sc.close();
		
		System.out.println("Fin del proceso");
	}

}
