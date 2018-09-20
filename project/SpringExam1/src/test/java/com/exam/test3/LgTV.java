package com.exam.test3;

public class LgTV implements TV{
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
		System.out.println("엘지 TV ---- 볼륨이 커진다.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("엘지 TV ----- 볼륨이 작아진다.");
	}
}	
