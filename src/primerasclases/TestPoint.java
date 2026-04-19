package primerasclases;

public class TestPoint {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.showSimple();
		p1.setSymbol('!');
		p1.showSimple();
		
		p1.showTest();
		p1.setColor("yellow");
		p1.showTest();
		p1.setColor("red");
		p1.showTest();
		
		p1.showGrid();
		p1.setX((byte)4);
		p1.setY((byte)6);
		p1.showGrid();
		p1.setX((byte)0);
		p1.setY((byte)7);
		p1.showGrid();
		p1.setX((byte)12);
		p1.setY((byte)0);
		p1.showGrid();
		p1.setX((byte)12);
		p1.setY((byte)7);
		p1.showGrid();
	}

}
