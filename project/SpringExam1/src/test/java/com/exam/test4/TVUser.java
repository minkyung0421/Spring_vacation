package com.exam.test4;

public class TVUser {
	public static void main(String[] args) {
		//Ŭ���̾�Ʈ�� �ش��ϴ� TVUser�� �ڽ��� �ʿ��� ��ü�� ����
		//�������� �ʴ´�. ���� �׷��ٸ� TV�� ����� �� ���� �ҽ��ڵ带
		//�����ؾ� �Ѵ�. TVUser�� ���� ��ü�� �ʿ��ϴٴ� ���� BeanFactory����
		//��û���� ���̰�,
		//BeanFactory�� Ŭ���̾�Ʈ�� ����� TV ��ü�� �����ϰ�
		//�����Ͽ� �Ѱ��� ���̴�.
		ApplicationContext ctx = 
				new GenericXmlApplicationContext("applicationContext.xml");
		TV tv = (TV)ctx.getBean("tv");
		BeanFactory factory = new BeanFactory();
	TV tv = new LgTV();
	//������
	tv.turnOn();
	tv.volumeUp();
	tv.volumeDown();
	tv.turnOff();
	}
}
