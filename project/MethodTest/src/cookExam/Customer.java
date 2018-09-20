package cookExam;

public class Customer {
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public String order(Server server, String foodName){
		System.out.println("�մ��� �丮�� ���������� �ֹ��߽��ϴ� :)");
		String food = server.serve(foodName);
		System.out.println("�޾Ҵ� �ֹ� �Ӥ���");
		return food;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		Chef chef = new Chef("���ֹ�");
		Server server = new Server("�ּ���", chef);
		Customer customer = new Customer("���");
		String food = customer.order(server, "��������");
		System.out.println(customer.getName() + "�� ���մϴ� ���ִ� ^��^");
	}
	
	
	
}
