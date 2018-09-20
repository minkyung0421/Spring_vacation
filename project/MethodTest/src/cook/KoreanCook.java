package cook;

public class KoreanCook implements ICook {

	@Override
	public void makeRice() {
		// TODO Auto-generated method stub
		System.out.println("밥을 만듭니다 :)");
	}

	@Override
	public void makeSoup() {
		// TODO Auto-generated method stub
		System.out.println("국을 만듭니다 :)");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("샐러드를 만듭니다 :)");
	}

	@Override
	public void makeSauce() {
		// TODO Auto-generated method stub
		System.out.println("양념을 만듭니다 :)");
	}

}
