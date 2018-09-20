package com.exam.test5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� �ش��ϴ� TVUser�� �ڽ��� �ʿ��� ��ü�� ����
		//�������� �ʴ´�. ���� �׷��ٸ� TV�� ����� �� ���� �ҽ��ڵ带
		//�����ؾ� �Ѵ�. TVUser�� ���� ��ü�� �ʿ��ϴٴ� ���� BeanFactory����
		//��û���� ���̰�,
		//BeanFactory�� Ŭ���̾�Ʈ�� ����� TV ��ü�� �����ϰ�
		//�����Ͽ� �Ѱ��� ���̴�.
		ApplicationContext ctx = new GenericXmlApplicationContext("applicationContext1.xml");
		BeanFactory factory = new BeanFactory();
		
	TV tv = (TV)ctx.getBean("tv");
	//������
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
