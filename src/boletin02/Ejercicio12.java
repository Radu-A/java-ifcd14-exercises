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
		
		for (int i = 1; i <= evenLength * 2; i++) {
			// load evenArray
			if (i % 2 == 0 && evenCount < evenLength) {
				evenArray[evenCount] = i;
				evenCount++;
			}
			// load oddArray
			if (i % 2 != 0 && oddCount < oddLength) {
				oddArray[oddCount] = i;
				oddCount++;
			}
		}
		
		// load resultArray
		for (int i = 0; i < evenLength + oddLength; i++)  {
			if (i < evenLength) {
				resultArray[i] = evenArray[i];
			} else {
				resultArray[i] = oddArray[i - evenLength];
			}
			
		}
		
		for (int number : evenArray) {
			System.out.printf("%d ", number);
		}

		System.out.println();
		
		for (int number : oddArray) {
			System.out.printf("%d ", number);
		}

		System.out.println();
		
		for (int number : resultArray) {
			System.out.printf("%d ", number);
		}

		System.out.println();
	}

}
