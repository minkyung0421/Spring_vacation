package cookExam;

public class Chef {
	private String name;

	public Chef(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String cook(String food){
		System.out.println("�丮�簡 �丮�� �մϴ� :)");
		return food;
	}
}
