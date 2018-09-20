package company;

public class Company {
	private Employee[] employee;
	private int cnt;
	
	public Company(){
		employee = new Employee[8];
		employee[0] = new Manager("Shamit", "54", "General Affairs Department");
		employee[1] = new Manager("Kate", "87", "Material Department");
		employee[2] = new Employee("Abel", "956");
		employee[3] = new Employee("Alyssa", "346");
		cnt = 4;
	}
	
	public void recruit(Employee employees){
		employee[cnt++] = employees;
	}
	
	public void makeMoney(){
		for(int i = 0; i < employee.length; i++){
			employee[i].work(); //´ÙÇü¼º
		}
	}
	public static void main(String[] args){
		Company com = new Company();
		com.makeMoney();
		
		com.recruit(new Employee("Bailey", "242"));
		com.recruit(new Manager("Charles", "745", "Beautification"));
		com.makeMoney();
	}
}
