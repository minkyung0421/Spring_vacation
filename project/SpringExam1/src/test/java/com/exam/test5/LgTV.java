package com.exam.test5;

public class LgTV implements TV{
	
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	
	public LgTV(){
		
	}
	
	public void turnOn(){
		System.out.println("엘지 TV ---- 전원이 켜진다.");
	}
	
	public void turnOff(){
		System.out.println("엘지 TV ---- 전원이 꺼진다");
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
}	
