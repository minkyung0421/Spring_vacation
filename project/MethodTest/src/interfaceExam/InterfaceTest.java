package interfaceExam;

public class InterfaceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person();
		Fish f1 = new Fish();
//		Flyable[] flys = {p1, f1};
		Flyable[] flys = new Flyable[2];
		flys[0] = p1; //��ĳ����
		flys[1] = f1; //��ĳ����

		for(int i = 0; i<flys.length; i++){
			flys[i].fly(); //������
		}
	}

}
