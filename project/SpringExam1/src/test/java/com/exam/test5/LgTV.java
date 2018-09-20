package com.exam.test5;

public class LgTV implements TV{
	
	private Speaker speaker;
	
	public void setSpeaker(Speaker speaker){
		this.speaker = speaker;
	}
	
	public LgTV(){
		
	}
	
	public void turnOn(){
		System.out.println("���� TV ---- ������ ������.");
	}
	
	public void turnOff(){
		System.out.println("���� TV ---- ������ ������");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		speaker.volumeUp(); //speaker���� ����
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		speaker.volumeDown();
	}
}	
