package lt.lhu.unit06_01.Triangle;

public class Equilateral extends Triangle {

	@Override
	public void perimeter() {
		this.perimeter = 3 * base;
	}

	@Override
	public void area() {
		this.area = (1 / 4) * Math.sqrt(3) * Math.pow(base, 2);
	}

	@Override
	public void height() {
		this.height = (1 / 2) * Math.sqrt(3) * base;
	}

}
