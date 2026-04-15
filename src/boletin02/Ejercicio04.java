package boletin02;

public class Ejercicio04 {

	public static void main(String[] args) {
		int[] numArray1 = {1, 3, 5, 7};
		int[] numArray2 = {2, 4, 6, 8};
		int[] resultArray = new int[numArray1.length];
		for (int i = 0; i < numArray1.length; i++) {
			resultArray[i] = numArray1[i] * numArray2[i];
			if (i == 0) {
				System.out.printf("%d", resultArray[i]);
			} else {
				System.out.printf("-%d", resultArray[i]);
			}
		}
		
	}

}
