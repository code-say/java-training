package BankApplication;

public class Main {

	public static void main(String args[]) {
		
		Account account1=new Account("Sam","Horn","sam@gmail.com",2000,1,"11123");
		
		account1.putMoney(20);
		account1.takeMoney(50);
	}
}
