package com.exam.test5;

public class SonySpeaker implements Speaker{
	public SonySpeaker(){
		System.out.println("�Ҵ� ����Ŀ ��ü ������");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("����Ŀ ������ �ø���");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("����Ŀ ������ �����");
	}

}
