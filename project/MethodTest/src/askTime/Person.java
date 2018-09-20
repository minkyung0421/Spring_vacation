package askTime;

public class Person {
	private Watch watch; //Person은 Watch에 의존한다
	
	//Watch를 주입
	public Person(Watch watch){
		this.watch = watch;
	}
	
	public Watch getWatch(){
		return watch;
	}
	
	public void setWatch(Watch watch){
		this.watch = watch;
	}
	
	public String whatTime(){
		if(watch != null){
			return watch.whatTime(); //위임
		}
		else{
			return "저는 시계가 없어요 :)";
		}
	}

}
