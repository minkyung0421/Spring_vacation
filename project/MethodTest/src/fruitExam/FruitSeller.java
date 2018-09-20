package fruitExam;

public class FruitSeller {
	private int numOfApples;
	private int applePrice;
	private int myMoney;
	
	public FruitSeller(int numOfApples, int applePrice, int myMoney) {
		super();
		this.numOfApples = numOfApples;
		this.applePrice = applePrice;
		this.myMoney = myMoney;
	}
	
	public int saleApples(int money){
		int num = money/applePrice;
		numOfApples -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult(){
		System.out.println("사과의 개수 : " + numOfApples);
		System.out.println("남은 돈 : " + myMoney);
	}
}
