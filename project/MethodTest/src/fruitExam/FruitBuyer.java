package fruitExam;

public class FruitBuyer {
	private int myMoney;
	private int numOfApples;
	
	public FruitBuyer(int myMoney) {
		super();
		this.myMoney = myMoney;
		this.numOfApples = 0;
	}
	
	public void buyApples(FruitSeller seller, int money){
		numOfApples += seller.saleApples(money); //����
		myMoney -= money;
	}
	
	public void showBuyResult(){
		System.out.println("���� �� : " + myMoney);
		System.out.println("����� ���� : " + numOfApples);
	}
}
