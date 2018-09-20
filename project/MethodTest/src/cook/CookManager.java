package cook;

public class CookManager {
	//CookManager가 구체적인 KoreanCook을 알고 있음
	//높은 결합도
	private ICook cook = new KoreanCook(); //의존관계
	
	public CookManager(ICook cook){
		this.cook = cook;
	}
	
	public void setCook(ICook cook){
		this.cook = cook;
	}
	
	public void orderRice(){
		cook.makeRice(); //위임, 다형성
	}
	
	public void orderSoup(){
		cook.makeSoup(); //위임, 다형성
	}
}
