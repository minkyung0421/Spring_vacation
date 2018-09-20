package shapeExam;

public class Triangle extends Shape{
	private int base, height;
	

	public Triangle(int base, int height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = base * height/2;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "»ï°¢Çü";
	}

}
