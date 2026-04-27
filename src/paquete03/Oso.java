package paquete03;

public class Oso extends Animal {
	
	public Oso(double peso) {
		super(peso);
	}
	
	public void rujir(int veces) {
		for (int i = 0; i < veces; i++) {
			System.out.printf("Grrrr");
		}
		System.out.printf("%n");
	}

}
