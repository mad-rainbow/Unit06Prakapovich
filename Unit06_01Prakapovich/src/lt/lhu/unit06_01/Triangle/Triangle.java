package lt.lhu.unit06_01.Triangle;

import lt.lhu.unit06_01.GeometricShape.GeometricShape;

public class Triangle extends GeometricShape {

	public double base;
	public double sideA;
	public double sideC;
	public double height;
	
	public void height() {
		this.height = 2 * (area / base);
	}
	
	public void base() {
		this.base = 2 * (area / height);
	}

	@Override
	public void perimeter() {
		this.perimeter = sideA + base + sideC;
		
	}

	@Override
	public void area() {
		this.area = (height * base) / 2;
	}
}
