package shapeExam;

public class Shapetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[4];
		shapes[0] = new Triangle(10, 20); //업캐스팅
		shapes[1] = new Square(10, 5);
		shapes[2] = new Square(10, 10);
		shapes[3] = new Triangle(20,10);
		
		for(int i = 0; i< shapes.length; i++){
			shapes[i].calcArea(); //다형성
			shapes[i].printArea(); //다형성
		}
	}

}
