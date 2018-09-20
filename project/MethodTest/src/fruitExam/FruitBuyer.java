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
		numOfApples += seller.saleApples(money); //위임
		myMoney -= money;
	}
	
	public void showBuyResult(){
		System.out.println("남은 돈 : " + myMoney);
		System.out.println("사과의 개수 : " + numOfApples);
	}
}
