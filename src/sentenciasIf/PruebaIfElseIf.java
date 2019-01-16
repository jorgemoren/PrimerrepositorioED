package sentenciasIf;

import java.util.Scanner;

public class PruebaIfElseIf {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		String sNumero = sc.nextLine();
		double numero = Double.parseDouble(sNumero);
		
		if (numero > 0) {
			System.out.println("Has introducido un número positivo");
		} else if (numero < 0) {
			System.out.println("Has introducido un número negativo");
		} else { // numero == 0
			System.out.println("Has introducido cero");
		}
		
		System.out.println("Fin del proceso");
		
		sc.close();

	}

}
