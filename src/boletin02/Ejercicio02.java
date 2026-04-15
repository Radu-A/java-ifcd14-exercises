package boletin02;

public class Ejercicio02 {

	public static void main(String[] args) {
		int[] numArray = {2, -3, 4, -1, 6};
		for (int i = 0; i <= numArray.length - 1; i++) {
			if (numArray[i] < 0) {
				numArray[i] = 0;
			}
		}
		for (int number : numArray) {
			System.out.printf("%d", number);
		}
	}

}
