package boletin01;

public class Ejercicio17 {

	public static void main(String[] args) {
		int count = 0;
		for (int i = 15; i <= 85; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				count++;
			}
 		}
		System.out.printf("Hay %d números entre 15 y 85 divisibles por 3 y por 5.", count);
	}

}
