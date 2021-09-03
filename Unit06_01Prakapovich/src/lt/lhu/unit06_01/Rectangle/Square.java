package lt.lhu.unit06_01.Rectangle;

public class Square extends Rectangle {

	@Override
	public void perimeter() {
		this.perimeter = 4 * width;
	}
	
	@Override
	public void area() {
		this.area = Math.pow(width, 2);
	}
}
