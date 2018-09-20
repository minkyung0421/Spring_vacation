package cook;

public class JapaneseCook implements ICook{

	@Override
	public void makeRice() {
		// TODO Auto-generated method stub
		System.out.println("ご飯を作ります :)");
	}

	@Override
	public void makeSoup() {
		// TODO Auto-generated method stub
		System.out.println("汁を作ります :)");
	}

	@Override
	public void makeSalad() {
		// TODO Auto-generated method stub
		System.out.println("サラダをつくります :)");
	}

	@Override
	public void makeSauce() {
		// TODO Auto-generated method stub
		System.out.println("ソースを作ります :)");
	}

}
