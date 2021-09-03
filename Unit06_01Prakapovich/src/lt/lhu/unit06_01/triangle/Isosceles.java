package lt.lhu.unit06_01.triangle;

public class Isosceles extends Triangle {

	@Override
	public void perimeter() {
		this.perimeter = 2 * sideA + base;
	}

	@Override
	public void area() {
		this.area = (base / 4) * Math.sqrt(4 * Math.pow(sideA, 2) - Math.pow(base, 2));
	}
	
	@Override
	public void height() {
		this.height = (1/2) * Math.sqrt(4 * Math.pow(sideA, 2) - Math.pow(base, 2));
	}
}
