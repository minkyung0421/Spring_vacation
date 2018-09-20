package com.exam.test4;

public class SamsungTV implements TV{
	public SamsungTV(){
		System.out.println("삼성 tv 한대가 생성됨");
	}
	
	public void volumeUp(){
		System.out.println("삼성 TV ---- 볼륨이 커진다");
	}
	
	public void volumeDown(){
		System.out.println("삼성 TV ----볼륨이 작아진다.");
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
