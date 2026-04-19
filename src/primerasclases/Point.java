package primerasclases;

public class Point {
	private byte x;
	private byte y;
	private String color;
	// carácter nulo de Unicode: '\u0000'
	private char symbol;
	
	public Point() {
		this((byte)0, (byte)0);
	}
	
	public Point(byte x, byte y) {
		this.setX(x);
		this.setY(y);
		this.setColor("black");
	}
	
	public Point(byte x, byte y, String color, char symbol) {
		this(x, y);
		this.setColor(color);
		this.setSymbol(symbol);
	}
	
	public Point(Point p) {
		this.setX(p.x);
		this.setY(p.y);
		this.setColor(p.color);
		this.setSymbol(p.symbol);
	}
	
	public void showSimple() {
		if (this.symbol == '\u0000') {
			System.out.println("No has definido ningún 'symbol'.");
		} else {
			System.out.printf("Point %c de color %s (%d, %d)%n", this.symbol, this.color, this.x, this.y);
		}
	}
	
	public void showTest() {
		String color = switch(this.color) {
			case "black" -> "\033[31m";
			case "red" -> "\033[31m";
			case "green" -> "\033[32m"; 
			case "yellow" -> "\033[33m"; 
			case "blue" -> "\033[34m"; 
			case "purple" -> "\033[35m";
			// default color black
			default -> "\u001B[0m";
		};
		String reset = "\u001B[0m";
		
		System.out.printf("Point %s%c%s de color %s (%d, %d)%n", color, this.symbol, reset, this.color, this.x, this.y);
	}
	
	private void printPrimary(boolean trigger) {
		String color = switch(this.color) {
			case "black" -> "\033[31m";
			case "red" -> "\033[31m";
			case "green" -> "\033[32m"; 
			case "yellow" -> "\033[33m"; 
			case "blue" -> "\033[34m"; 
			case "purple" -> "\033[35m";
			// default color black
			default -> "\u001B[0m";
		};
		String reset = "\u001B[0m";
		for (int j = 0; j <= 12; j++) {
			if (j != 12) {
				if (trigger && j == this.x) {
					System.out.printf("%s%c%s--", color, this.symbol, reset);
				} else {
					System.out.printf("+--");
				}
			} else {
				if (trigger && j == this.x) {
					System.out.printf("%s%c%s%n", color, this.symbol, reset);
				} else {
					System.out.printf("+%n");
				}
			}
		}
	}
	
	private void printGap() {
		for (int j = 0; j <= 12; j++) {
			if (j != 12) {
				System.out.printf("|  ");
			} else {
				System.out.printf("|%n");
			}
		}
	}
	
	private void printNumberLine() {
		for (int j = 0; j <= 12; j++) {
			if (j < 9) {
				System.out.printf("%d  ", j);
			} else if (j < 12){
				System.out.printf("%d ", j);
			} else {
				System.out.printf("%d%n", j);
			}
		}
	}
	
	public void showGrid() {
		for (int i = 7; i >=0; i--) {
			System.out.printf("%d ", i);
			if (i == this.y) {
				this.printPrimary(true);
			} else {
				this.printPrimary(false);
			}
			System.out.printf("  ");
			if (i != 0) {
				this.printGap();
			} else {
				this.printNumberLine();
			}
		}
	}
	
	public boolean up() {
		if (this.y < 7) {
			this.y++;
			return true;
		} else return false;
	}
	
	public boolean down() {
		if (this.y > 0) {
			this.y--;
			return true;
		} else return false;
	}
	
	public boolean left() {
		if (this.x < 12) {
			this.x++;
			return true;
		} else return false;
	}
	
	public boolean right() {
		if (this.x > 0) {
			this.x--;
			return true;
		} else return false;
	}
	
	// getters 
		
	public byte getX() {
		return this.x;
	}
	public byte getY() {
		return this.y;
	}
	public String getColor() {
		return this.color;
	}
	public char getSymbol() {
		return this.symbol;
	}
	
	// setters
	
	public void setX(byte x) {
		this.x = x >= 0 && x <= 12 ? x : this.x;
	}
	public void setY(byte y) {
		this.y = y >= 0 && y <= 7 ? y : this.y;
	}
	public void setColor(String color) {
		// “red” || “green” || “yellow” || “blue” || “purple”
		this.color = color == "red" 
				|| color == "green" 
				|| color ==  "yellow"
				|| color == "blue" 
				|| color == "purple" ?
			 color :
			"black";
	}
	public void setSymbol(char symbol) {
		this.symbol = symbol;
	}
}
