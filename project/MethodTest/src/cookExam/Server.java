package cookExam;

public class Server {
	private String name;
	private Chef chef;
	
	public Server(String name, Chef chef) {
		super();
		this.name = name;
		this.chef = chef;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String serve(String foodName){
		System.out.println("�������� �ֹ��� �޾ҽ��ϴ� :)");
		String food = chef.cook(foodName);
		System.out.println("�ֹ������κ��� �������� �丮�� �޾ҽ��ϴ� :)");
		return food;
	}
	
	
}
