package boletin01;

public class Ejercicio06 {

	public static void main(String[] args) {
		int acc = 0;
		for (int i = 1; i <= 20; i++) {
			acc+=i;
		}
		System.out.println("Suma de primeros 20 números naturales es " + acc);
		
		// Test
		int acc2 = 1;
		for (int i = 1; i <= 10; i++) {
			acc2*=i;
		}
		System.out.println("El producto de los 10 primeros números naturales es " + acc2);
		
	}

}
