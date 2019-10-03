package flexon.java1;

public class BankAccount {
	int accountnumber = 123456789;
	double balance = 50.0;
	String customername = "Andrew";
	String email = "andrewyeung@gmail.com";
	long phonenumber = 9876543321L;
	
	public void deposit(double amount) {
		balance += amount;
		System.out.println("The new balance is: " + balance);
	}
	
	public void withdraw(double amount) {
		if (balance > amount) {
		balance -= amount;
		System.out.println("The new balance is: " + balance);
		}
	}
	
	public void printinfo() {
		System.out.println("Customer Name: " + customername);
		System.out.println("Account Number: " + accountnumber);
		System.out.println("Balance: " + balance);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phonenumber);
	}
}
