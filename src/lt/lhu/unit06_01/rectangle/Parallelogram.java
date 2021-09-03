package lt.lhu.unit06_01.rectangle;

public class Parallelogram extends Rectangle {

	public double height;

	@Override
	public void area() {
		this.area = width * height;
	}

	@Override
	public void perimeter() {
		this.perimeter = 2 * (length + width);
	}

}
