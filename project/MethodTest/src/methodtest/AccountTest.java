package methodtest;

class Account{
	String name;
	int balance;
	public Account(String name){
		this.name = name;
	}
	public Account(String name, int balance){
		this.name = name;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int withdraw(int i) {
		// TODO Auto-generated method stub
		if(balance < i){
			System.out.println("�ܾ��� �����մϴ�.");
			return 0;
		}
		else{
			balance -= i;
			return i;
		}
		
		
	}
	public int deposit(int i) {
		// TODO Auto-generated method stub
		balance += i;
		return i;
	}
	
}

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-------------ȫ�浿 ����-------------");
		Account a = new Account("ȫ�浿", 10000);
		System.out.printf("%d���� �ԱݵǾ����ϴ�\n", a.deposit(20000));
		System.out.printf("%s���� �ܾ��� %d�Դϴ�\n", a.getName(), a.getBalance());
		System.out.printf("%d���� ��ݵǾ����ϴ�\n", a.withdraw(40000));
		System.out.printf("%d���� ��ݵǾ����ϴ�\n", a.withdraw(10000));
		System.out.printf("%s���� �ܾ��� %d�Դϴ�\n", a.getName(), a.getBalance());
		
		System.out.println("------------����� ����-----------");
		Account b = new Account("�����");
		b.withdraw(1000);
		System.out.printf("%s���� �ܾ��� %d�Դϴ�\n", b.getName(), b.getBalance());
	}

}
