package com.exam.test4;

public class SamsungTV implements TV{
	public SamsungTV(){
		System.out.println("�Ｚ tv �Ѵ밡 ������");
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
