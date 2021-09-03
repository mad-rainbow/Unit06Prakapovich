package lt.lhu.unit06_01.Rectangle;

import lt.lhu.unit06_01.GeometricShape.GeometricShape;

public class Rectangle extends GeometricShape {

	public double length;
	public double width;

	@Override
	public void perimeter() {
		this.perimeter = 2 * (length - width);
	}

	@Override
	public void area() {
		this.area = length * width;
	}

}
