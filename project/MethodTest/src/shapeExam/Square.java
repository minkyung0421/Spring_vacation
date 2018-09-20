package shapeExam;

public class Square extends Shape{
	
	private int width, length;
	

	public Square(int width, int length) {
		super();
		this.width = width;
		this.length = length;
	}

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area = width * length;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "»ç°¢Çü";
	}
	

}
