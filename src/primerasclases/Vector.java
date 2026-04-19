package primerasclases;

public class Vector {
	private int x;
	private int y;
	
	public Vector (int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public Vector (int value) {
		this.x = value;
		this.y = value;
	}
	
	public Vector (Vector copy) {
		this.x = copy.x;
		this.y = copy.y;
	}
	
	public Vector suma(Vector v) {
		return new Vector(this.x + v.x, this.y + v.y);
	}
	
	public Vector resta(Vector v) {
		return new Vector(this.x - v.x, this.y - v.y);
	}
	
	public Vector opera(Vector v, char operacion) {
		Vector result = new Vector (0);
		if (operacion == '+') {
			result = this.suma(v);
			System.out.printf("(%d,%d) + (%d, %d) = (%d,%d)%n", this.x, this.y, v.x, v.y, result.x, result.y);
			return result;
		} else if (operacion == '-') {
			result = this.resta(v);
			System.out.printf("(%d,%d) - (%d, %d) = (%d,%d)%n", this.x, this.y, v.x, v.y, result.x, result.y);
			return result;
		} else {
			System.out.println("Operación no válida.");
			return result;
		}
	}
	
	public Vector prod(int n) {
		return new Vector(this.x * n, this.y * n);
	}
	
	public Vector opera(int n) {
		Vector result = this.prod(n);
		System.out.printf("%d * (%d, %d) = (%d,%d)%n", n, this.x, this.y, result.x, result.y);
		return result;
	}
	
	public int prodE(Vector v) {
		return this.x * v.x + this.y * v.y;
	}
	
	public int prodV(Vector v) {
		return this.x * v.x - this.y * v.y;
	}
	
	public void show() {
		System.out.printf("Vector de coordenadas (%d, %d)%n", this.x, this.y);
	}

	public boolean esPerpendicular(Vector v) {
		int result = this.prodE(v);
		return result == 0 && (this.x !=0 || this.y != 0) && (v.x != 0 || v.y != 0);
	}
	
	public boolean esParalelo(Vector v) {
		int result = this.prodV(v);
		return result == 0 && (this.x !=0 || this.y != 0) && (v.x != 0 || v.y != 0);
	}
	
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	public void setX(int value) {
		this.x = value;
	}
	public void setY(int value) {
		this.y = value;
	}
}
