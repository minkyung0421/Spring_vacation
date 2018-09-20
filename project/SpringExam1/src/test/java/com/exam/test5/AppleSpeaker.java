package com.exam.test5;

public class AppleSpeaker implements Speaker{
	public AppleSpeaker(){
		System.out.println("¾ÖÇÃ ½ºÇÇÄ¿ °´Ã¼ »ý¼ºµÊ");
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
