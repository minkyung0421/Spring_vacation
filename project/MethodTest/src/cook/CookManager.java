package cook;

public class CookManager {
	//CookManager�� ��ü���� KoreanCook�� �˰� ����
	//���� ���յ�
	private ICook cook = new KoreanCook(); //��������
	
	public CookManager(ICook cook){
		this.cook = cook;
	}
	
	public void setCook(ICook cook){
		this.cook = cook;
	}
	
	public void orderRice(){
		cook.makeRice(); //����, ������
	}
	
	public void orderSoup(){
		cook.makeSoup(); //����, ������
	}
}
