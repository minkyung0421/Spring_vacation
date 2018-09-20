package shapeExam;

public abstract class Shape {
	protected int area;
	public abstract void calcArea();
	public void printArea(){
		System.out.println(getName() + "¿« ≥–¿Ã: " + area);
	}
	
	public abstract String getName();

}
