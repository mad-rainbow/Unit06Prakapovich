package lt.lhu.unit06_01.circle;

import lt.lhu.unit06_01.geometricShape.GeometricShape;

public class Circle extends GeometricShape {

	double radius;

	@Override
	public void perimeter() {
		this.perimeter = 2 * Math.PI * radius;
	}

	@Override
	public void area() {
		this.area = Math.PI * Math.pow(radius, 2);
	}

	public void radius() {
		this.radius = perimeter / 2 * Math.PI;
	}
}