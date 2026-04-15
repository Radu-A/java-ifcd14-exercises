package boletin02;

public class Ejercicio03 {

	public static void main(String[] args) {
		int length = 0;
		int index = 0;
		
		for (int i = 1; i <= 1_000; i+=100) {
			length++;
		}
		
		int[] numArray = new int[length];
		for (int i = 1; i <= 1_000; i+=100) {
			numArray[index] = i;
			index++;
		}
		
		for (int num : numArray) {
			if (num == 1) {
				System.out.printf("%d", num);
			} else {
				System.out.printf("-%d", num);
			}
		}
	}

}
