package gunExam2.copy;

public class Gun {
	private int bullet;
	
	public Gun(int bullet){
		this.bullet = bullet;
	}

	public int getBullet() {
		return bullet;
	}

	public void setBullet(int bullet) {
		this.bullet = bullet;
	}
	
	public void shoot(){
		System.out.println("BBANG!!");
		bullet--;
	}
	
}
