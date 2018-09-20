package gunExam2.copy;

public class Police {
	private int handcuffs;
	
	public Police(int handcuffs){
		this.handcuffs = handcuffs;
	}

	public int getHandcuffs() {
		return handcuffs;
	}

	public void setHandcuffs(int handcuffs) {
		this.handcuffs = handcuffs;
	}
	
	public void putHandcuff(){
		System.out.println("SNAP!");
		handcuffs--;
	}
	
	public void shoot(Gun pistol){
		if(pistol == null){
			System.out.println("HUT BBANG!");
		}else{
			pistol.shoot(); //ю╖юс
		}
	}
	
	public static void main(String[] args){
		Police p1 = new Police(3);
		Gun pistol = new Gun(5);
		//p1.pistol.bullet
		p1.shoot(pistol);
		p1.putHandcuff();
		
		Police p2 = new Police(3);
		Gun pistol1 = null;
		p2.shoot(pistol1);
		p1.putHandcuff();
	}
	
	
	
	
}
