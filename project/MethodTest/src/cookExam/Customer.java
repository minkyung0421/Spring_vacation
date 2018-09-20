package cookExam;

public class Customer {
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}
	
	public String order(Server server, String foodName){
		System.out.println("손님이 요리를 종업원에게 주문했습니다 :)");
		String food = server.serve(foodName);
		System.out.println("받았다 주문 ㅣㅅㅣ");
		return food;
	}
	
	public String getName(){
		return name;
	}
	
	public static void main(String[] args) {
		Chef chef = new Chef("왕주방");
		Server server = new Server("최서버", chef);
		Customer customer = new Customer("김고객");
		String food = customer.order(server, "낙지볶음");
		System.out.println(customer.getName() + "이 말합니다 맛있다 ^ㅅ^");
	}
	
	
	
}
