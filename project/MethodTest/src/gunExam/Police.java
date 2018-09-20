package gunExam;

public class Police {
	private int handcuffs;
	private Gun pistol;
	
	public Police(int bullet, int handcuffs){
		this.handcuffs = handcuffs;
		if(bullet > 0)
			pistol = new Gun(bullet);
	}

	public int getHandcuffs() {
		return handcuffs;
	}

	public void setHandcuffs(int handcuffs) {
		this.handcuffs = handcuffs;
	}

	public Gun getPistol() {
		return pistol;
	}

	public void setPistol(Gun pistol) {
		this.pistol = pistol;
	}
	
	public void putHandcuff(){
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shoot(){
		if(pistol == null){
			System.out.println("HUT BBANG!");
		}else{
			pistol.shoot(); //ю╖юс
		}
	}
	
	public static void main(String[] args){
		Police p1 = new Police(5, 3);
		//p1.pistol.bullet
		p1.shoot();
		p1.putHandcuff();
		
		Police p2 = new Police(0, 3);
		p2.shoot();
		p1.putHandcuff();
	}
	
	
	
	
}
