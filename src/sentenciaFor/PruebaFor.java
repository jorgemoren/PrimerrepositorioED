package sentenciaFor;

public class PruebaFor {

	public static void main(String[] args) {
		// todo for se puede convertir en un while
		// No todo while se puede transformar en un for
		/* solo puedo transformar un while en un for si:
		 * - tiene inicializado un contador
		 * - el contador está implicado en la condición
		 * - dentro de las sentencias de repetición se aumenta 
		 * el contador
		 */
			
		for (int x = 0; x < 10; x++) { 
			System.out.println(x);
			
		}
		
		System.out.println("Fin del proceso");

	}

}
