package paquete03;

public class Animal {
	private double peso;
	
	public Animal(double peso) {
		this.setPeso(peso);
	}
	
	public void identificar() {
		System.out.printf("Soy un %s de %.2f kilos de peso.%n", this.getClass().getSimpleName(), this.peso);
	}
	
	public double getPeso() {
		return this.peso;
	}

	public void setPeso(double peso) {
		this.peso = peso > 1 ? peso : 1;
	}
	
}
