package goodCookExam;

public class CookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ICook cook = new KoreanCook();
		//�����ڸ� �̿��� KoreanCook�� ��������
		CookManager manager = new CookManager(cook);
		manager.orderRice();
		manager.orderSoup();
		
		ICook cook1 = new JapaneseCook();
		//���͸� �̿��� ���д������� ��������
		manager.setCook(cook1);
		manager.orderRice();
		manager.orderSoup();
	}

}
