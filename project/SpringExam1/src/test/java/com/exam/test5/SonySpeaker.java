package com.exam.test5;

public class SonySpeaker implements Speaker{
	public SonySpeaker(){
		System.out.println("¼Ò´Ï ½ºÇÇÄ¿ °´Ã¼ »ý¼ºµÊ");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
		System.out.println("½ºÇÇÄ¿ º¼·ýÀ» ¿Ã¸°´Ù");
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("½ºÇÇÄ¿ º¼·ýÀ» ³·Ãá´Ù");
	}

}
