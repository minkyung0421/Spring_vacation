package askTime;

public class Person {
	private Watch watch; //Person�� Watch�� �����Ѵ�
	
	//Watch�� ����
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
			return watch.whatTime(); //����
		}
		else{
			return "���� �ð谡 ����� :)";
		}
	}

}
