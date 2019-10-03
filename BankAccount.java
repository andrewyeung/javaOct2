package flexon.java1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class BankAccount {
	int accountnumber = 123456789;
	double balance = 1000.0;
	String accounttype = "Checking";
	String customername = "Andrew";
	String customerlastname = "Y";
	String email = "andrewyeung@gmail.com";
	long phonenumber = 9876543321L;
	
	//Obtain the current formatted timestamp
	LocalDateTime dateTime = LocalDateTime.now();
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String timestamp = dateTime.format(formatter);
	
	//Create 2 Arraylists to store Transaction History
	ArrayList<TransactionHistory> deposithistory = new ArrayList<TransactionHistory>();
	ArrayList<TransactionHistory> withdrawalhistory = new ArrayList<TransactionHistory>();
	
	//Keep track of the day limit of deposit and withdrawal
	double dailywithdrawlimit = 1000.0;
	int deposittimes = 0;
	

	
	public void deposit(double amount) {
		if (amount <= 500 && amount >= 50 && deposittimes <= 3) {
		balance += amount;
		deposithistory.add(new TransactionHistory(timestamp, amount));
		deposittimes++;
		
		System.out.println("The new balance is: " + balance);
		}
		else if (amount > 500){
		System.out.println("You have exceeded the $500 deposit limit");
		}
		else if (amount < 50) {
		System.out.println("Insufficient deposit amount");	
		}
		else {
		System.out.println("You have exceeded the amount of times to deposit");
		}
	}
	
	public void withdraw(double amount) {
		if (balance > amount && dailywithdrawlimit > amount) {
		balance -= amount;
		dailywithdrawlimit -= amount;
		withdrawalhistory.add(new TransactionHistory(timestamp, amount));
		
		System.out.println("The new account balance is: " + balance);
		}
	}
	
	public void printinfo() {
		System.out.println("Customer Name: " + customername + " " + customerlastname);
		System.out.println("Account Type: " + accounttype);
		System.out.println("Current Balance: " + balance);
		System.out.println("Current Date & Time: " + timestamp);
	}
	
	public void deposithistory() {
		for (int i = 0; i < deposithistory.size(); i++) {
			   System.out.println(deposithistory.get(i));
			  }
	}
	public void withdrawalhistory() {
		System.out.println(withdrawalhistory);
	}
}
