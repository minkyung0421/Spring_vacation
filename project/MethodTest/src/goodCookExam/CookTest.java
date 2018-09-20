package goodCookExam;

public class CookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICook cook = new KoreanCook();
		//생성자를 이용해 KoreanCook을 주입해줌
		CookManager manager = new CookManager(cook);
		manager.orderRice();
		manager.orderSoup();
		
		ICook cook1 = new JapaneseCook();
		//세터를 이용해 재패니즈쿡을 주입해줌
		manager.setCook(cook1);
		manager.orderRice();
		manager.orderSoup();
	}

}
