package boletin01;

public class Ejercicio18 {

	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for (int i = 10; i <= 50; i++) {
			if (i % 2 == 0) {
				count++;
				sum+=i;
			}
		}
		double avg = (double)(sum/count);
		System.out.printf("El promedio de los pares entre 10 y 50 es %.2f", avg);
		// .2 is the key for resolving the format
	}

}
