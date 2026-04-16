package boletin02;

public class Ejercicio12 {

	public static void main(String[] args) {
		int evenLength = 10;
		int[] evenArray = new int[evenLength];
		int evenCount = 0;
		
		int oddLength = 5;
		int[] oddArray = new int[oddLength];
		int oddCount = 0;
		
		int resultLength = evenLength + oddLength;
		int[] resultArray = new int[resultLength];
		
		for (int i = 0; i <= evenLength * 2; i++) {
			if (i % 2 == 0 && evenCount <= evenLength) {
				evenArray[i] = i;
				evenCount++;
			}
			if (i % 2 != 0 && oddCount <= oddLength) {
				oddArray[i] = i;
				oddCount++;
			}
			
		}
		
	}

}
