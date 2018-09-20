package com.exam.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//클라이언트에 해당하는 TVUser는 자신이 필요한 객체를 직접
		//생성하지 않는다. 만약 그랬다면 TV가 변경될 때 마다 소스코드를
		//수정해야 한다. TVUser는 단지 객체가 필요하다는 것을 BeanFactory에게
		//요청했을 뿐이고,
		//BeanFactory가 클라이언트가 사용할 TV 객체를 적절하게
		//생성하여 넘겨준 것이다.
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext1.xml");
		BeanFactory factory = new BeanFactory();
		
	TV tv = (TV)ctx.getBean("tv");
	//다형성
	tv.turnOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.turnOff();
	
	TV tv1 = ctx.getBean("tv1", TV.class);
	tv1.turnOn();
	tv1.turnOff();
	tv1.volumeDown();
	tv1.volumeUp();
	}
}
