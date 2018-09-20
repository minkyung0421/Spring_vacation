package interfaceExam;

public class Person implements Flyable, singable{

	@Override
	public void sing() {
		// TODO Auto-generated method stub
		System.out.println("人が歌を歌う :)");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("人が飛んだ :)");
	}
	
	public void walk(){
		System.out.println("人が歩いていく :)");
	}

}
