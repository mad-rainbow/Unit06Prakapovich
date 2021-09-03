package lt.lhu.unit06_01.Circle;

public class Cone extends Circle {

	double height;
	double volume;
	double slantHeight;

	public void volume() {
		this.volume = Math.PI * Math.pow(radius, 2) * (height / 3);
	}

	@Override
	public void radius() {
		this.radius = Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(height, 2));
	}

	public void height() {
		this.height = Math.sqrt(Math.pow(slantHeight, 2) - Math.pow(radius, 2));
	}

	@Override
	public void area() {
		this.area = Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
	}

}
