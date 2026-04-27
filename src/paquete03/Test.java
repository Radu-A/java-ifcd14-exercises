package paquete03;

public class Test {

	public static void main(String[] args) {
		Gato gato = new Gato(3.4);
		Perro perro = new Perro(35);
		Animal animal = new Animal(20.2);
		
		gato.identificar();
		perro.identificar();
		animal.identificar();
		
		Animal a1 = new Gato(5);
		Animal a2 = new Perro(25);
		Gato a3 = new Gato(10);
		Perro a4 = new Perro(30);
		
		a1.identificar();
		a2.identificar();
		a3.identificar();
		a4.identificar();
		
		Oso oso = new Oso(250);
		oso.rujir(8);
		
		Animal a11 = new Gato(5);
		Animal a21 = new Perro(25);
		Gato a31 = new Gato(10);
		Perro a41 = new Perro(30);
		Animal a51 = new Oso(800);
		Oso a61 = new Oso(1200);
		/*
		System.out.println("Analizando a11");
		System.out.println(a11 instanceof Animal);
		System.out.println(a11 instanceof Gato);
		System.out.println(a11 instanceof Perro);
		System.out.println(a11 instanceof Oso);
		System.out.println("Analizando a21");
		System.out.println(a21 instanceof Animal);
		System.out.println(a21 instanceof Gato);
		System.out.println(a21 instanceof Perro);
		System.out.println(a21 instanceof Oso);	
		System.out.println("Analizando a31");
		System.out.println(a31 instanceof Animal);
		System.out.println(a31 instanceof Gato);
		System.out.println(a31 instanceof Perro);
		System.out.println(a31 instanceof Oso);
		System.out.println("Analizando a41");
		System.out.println(a41 instanceof Animal);
		System.out.println(a41 instanceof Gato);
		System.out.println(a41 instanceof Perro);
		System.out.println(a41 instanceof Oso);
		System.out.println("Analizando a51");
		System.out.println(a51 instanceof Animal);
		System.out.println(a51 instanceof Gato);
		System.out.println(a51 instanceof Perro);
		System.out.println(a51 instanceof Oso);
		System.out.println("Analizando a61");
		System.out.println(a61 instanceof Animal);
		System.out.println(a61 instanceof Gato);
		System.out.println(a61 instanceof Perro);
		System.out.println(a61 instanceof Oso);
		*/
		a61.rujir(50);
	}

}
