package com.exam.test1;

public class TVUser {
	public static void main(String[] args) {
		
		//SamsungTV와 LgTV는 메소드 시그니처가 다르므로
		//TVUser코드 대부분을 수정해야 TV를 교체할 수 있다.
		//현재 상태에서는 두TV클래스가 같은 메소드를 가지게 끔 강제할 어떠한 수단도 없다
		//만약 TVUser와 같은 클라이어언트 프로그램이 하나가 아니라 
		//여러개라면 유지보수는 더욱 더 힘들 것이며
		//TV교체를 결정하기가 쉽지 않을 것이다.
		
//		SamsungTV tv = new SamsungTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		
//		LgTV tv = new LgTV();
//		tv.powerOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
	}
}
