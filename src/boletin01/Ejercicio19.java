package boletin01;

public class Ejercicio19 {

	public static void main(String[] args) {
		int base = 3;
		boolean mark = true;
		String result = "";
		for (int i = 1; i <= 8; i++) {
			int pow = (int)Math.pow(base, i);
			if (mark) {
				result = result + pow;
				mark = false;
			} else {
				result = result + ", " + pow;
			}
		}
		System.out.println(result);
	}

}
