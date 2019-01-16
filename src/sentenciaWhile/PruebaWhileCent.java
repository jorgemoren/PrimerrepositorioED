package sentenciaWhile;

public class PruebaWhileCent {

	public static void main(String[] args) {
		int x = 0;
		//boolean continuar = true;
		
		//while (continuar) {
		while (true) {
			System.out.println(x);
			x++;
			if (x == 50) {
				//continuar = false;
				break;
			}
		}
		
		System.out.println("Fin del proceso");

	}

}
