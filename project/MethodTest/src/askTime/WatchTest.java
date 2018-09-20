package askTime;

public class WatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person(null);
		System.out.println(p.whatTime());
		
		p.setWatch(new Watch());
		System.out.println(p.whatTime());
		
		Watch watch = new Watch();
		//생성자를 통해서 watch를 주입
		Person p1 = new Person(watch);
		System.out.println(p1.whatTime());
	}

}
