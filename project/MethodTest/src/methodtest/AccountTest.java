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
			System.out.println("잔액이 부족합니다.");
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
		System.out.println("-------------홍길동 계좌-------------");
		Account a = new Account("홍길동", 10000);
		System.out.printf("%d원이 입금되었습니다\n", a.deposit(20000));
		System.out.printf("%s님의 잔액은 %d입니다\n", a.getName(), a.getBalance());
		System.out.printf("%d원이 출금되었습니다\n", a.withdraw(40000));
		System.out.printf("%d원이 출금되었습니다\n", a.withdraw(10000));
		System.out.printf("%s님의 잔액은 %d입니다\n", a.getName(), a.getBalance());
		
		System.out.println("------------사오정 계좌-----------");
		Account b = new Account("사오정");
		b.withdraw(1000);
		System.out.printf("%s님의 잔액은 %d입니다\n", b.getName(), b.getBalance());
	}

}
