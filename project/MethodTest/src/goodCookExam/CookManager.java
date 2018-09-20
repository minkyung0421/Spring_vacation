package goodCookExam;

//CookManager�� ��ü���� KoreanCook�̳� JapaneseCook�� ��
//CookManager�� �߻����� ICook�� ������
//���� ���յ� => ���������ߵ�
public class CookManager {
	private ICook cook; //��������
	
	//�����ڸ� �̿��� ICook ����
	public CookManager(ICook cook){
		this.cook = cook;
	}
	
	//setter�� �̿��� ICook ����
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
