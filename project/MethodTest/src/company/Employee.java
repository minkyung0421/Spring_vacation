package company;

public class Employee {
	protected String name;
	protected String idnum;
	
	public Employee(String name, String idnum){
		this.name =name;
		this.idnum = idnum;
	}
	
	public void work(){
		System.out.println("���� " + name + "�� ������ ���մϴ� :)");
	}
}
