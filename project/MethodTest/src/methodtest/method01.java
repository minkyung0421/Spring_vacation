package methodtest;

class Score{
	public void pass1(int jumsu1, int jumsu2, int jumsu3){
		
		int sum = 0;
		int avg = 0;
		
		sum = jumsu1 + jumsu2 + jumsu3;
		avg = sum / 4;
		
		if(avg >= 60){
			System.out.println("�հ��Դϴ�.");
		}else{
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public boolean pass2(int jumsu1, int jumsu2, int jumsu3){
		
		int sum = 0;
		int avg = 0;
		
		sum = jumsu1 + jumsu2 + jumsu3;
		avg = sum / 4;
		
		if(avg >= 60){
			return true;
		}else{
			return false;
		}
	}
	
	public String pass3(int jumsu1, int jumsu2, int jumsu3){
		int sum = 0;
		int avg = 0;
		
		sum = jumsu1 + jumsu2 + jumsu3;
		avg = sum / 4;
		
		if(avg >= 60){
			return "�հ�";
		}else{
			return "���հ�";
		}
	}
	
}
public class method01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Score sc = new Score();
		sc.pass1(60, 80, 10);
		
		sc.pass2(60, 80, 10);
		if(sc.pass2(60, 80, 10) == true){
			System.out.println("�հ��Դϴ�.");
		}else{
			System.out.println("���հ��Դϴ�.");
		}
		
		System.out.println(sc.pass3(60, 80, 10));
	}

}
