package goodCookExam;

//CookManager는 구체적인 KoreanCook이나 JapaneseCook을 모름
//CookManager는 추사적인 ICook에 의존함
//낮은 결합도 => 유지보수잘됨
public class CookManager {
	private ICook cook; //의존관계
	
	//생성자를 이용한 ICook 주입
	public CookManager(ICook cook){
		this.cook = cook;
	}
	
	//setter를 이용한 ICook 주입
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
