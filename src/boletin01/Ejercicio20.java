package boletin01;

public class Ejercicio20 {

	public static void main(String[] args) {
		int start = 1;
		String block = "";
		String result = "";
		for (int i = 1; i <= 3; i++) {
			for (char j = '1'; j <= '9'; j++) {
				block+= j;
			}
			if (i == start) {
				result += block;
			} else {
				result += "-" + block;
			}
			block = "";
		}
		System.out.println(result);
	}

}
