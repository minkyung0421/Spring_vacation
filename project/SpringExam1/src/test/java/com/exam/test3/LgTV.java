package com.exam.test3;

public class LgTV implements TV{
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
		System.out.println("���� TV ---- ������ Ŀ����.");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("���� TV ----- ������ �۾�����.");
	}
}	
