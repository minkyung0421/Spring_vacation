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
			System.out.println("Tv�� �������ϴ�.");
		}else{
			power = false;
			System.out.println("tv�� �������ϴ�.");
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
//		System.out.println("���� tvä���� %d�Դϴ�\n", tvgetChannel());
//		System.out.println("���� tv������ %d�Դϴ�\n", tv.getVolume());
//		//tv.setChannel(16);
//		tv.channelUp();
//		tv.volumeUp();
//		System.out.println("���� tvä���� %d�Դϴ�\n", tv.getChannel());
//		System.out.println("���� tv������ %d�Դϴ�\n", tv.getVolume());
		tv.powerOn();
	}	

}
