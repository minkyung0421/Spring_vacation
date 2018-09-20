package com.exam.test5;

public class SamsungTV implements TV{
	public SamsungTV(){
		
	}
	
	public SamsungTV(Speaker speaker){
		this.speaker = speaker;
	}
	
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	
	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp(); //speaker에게 위임
	}

	
	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("삼성TV ---전원이 켜진다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("삼성 TV ---전원이 꺼진다");
	}
}
