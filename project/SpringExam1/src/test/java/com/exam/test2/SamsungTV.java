package com.exam.test2;

public class SamsungTV implements TV{
	public SamsungTV(){
		
	}
	
	public void volumeUp(){
		System.out.println("�Ｚ TV ---- ������ Ŀ����");
	}
	
	public void volumeDown(){
		System.out.println("�Ｚ TV ----������ �۾�����.");
	}

	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("�ＺTV ---������ ������");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("�Ｚ TV ---������ ������");
	}
}
