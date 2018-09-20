package methodtest;

class TV{
	private int channel;
	private int volume;
	private boolean power;
	
	public TV(){
		channel = 9;
		volume = 20;
		power = false;
	}
	
	public TV(int channel, int volume, boolean power){
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}
	public void powerOn(){
		if(power == false){
			power = true;
			System.out.println("Tv가 켜졌습니다.");
		}else{
			power = false;
			System.out.println("tv가 꺼졌습니다.");
		}
	}
	
	public void channelUp(){
		channel++;
	}
	
	public void channelDown(){
		channel--;
	}
	
	public void volumeUp(){
		volume++;
	}
}
public class WatchTv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new TV();
		tv.powerOn();
//		System.out.println("현재 tv채널은 %d입니다\n", tvgetChannel());
//		System.out.println("현재 tv볼륨은 %d입니다\n", tv.getVolume());
//		//tv.setChannel(16);
//		tv.channelUp();
//		tv.volumeUp();
//		System.out.println("현재 tv채널은 %d입니다\n", tv.getChannel());
//		System.out.println("현재 tv볼륨은 %d입니다\n", tv.getVolume());
		tv.powerOn();
	}	

}
