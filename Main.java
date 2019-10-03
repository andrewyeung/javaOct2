package flexon.java1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    BankAccount customer1 = new BankAccount();
		Scanner command = new Scanner(System.in);  // Create a Scanner object
	    outerloop:
		do {
		System.out.println("*******************");
		System.out.println("Enter your command: ");
	    System.out.println("Choose 1 for Withdrawal");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Account Balance");
        System.out.println("Choose 4 for Transaction History");
        System.out.println("Choose 5 for EXIT");
	    int commandnum = command.nextInt(); 
	    
	    
	    switch(commandnum)
	    {
	    case 1: 
	    	System.out.println("Enter money to be withdrawn: ");
	    	double withdrawamount = command.nextDouble();
	    	customer1.withdraw(withdrawamount);
	    	break;
	    case 2:
	    	System.out.println("Enter money to be deposited: ");
	    	double depositamount = command.nextDouble();
	    	customer1.deposit(depositamount);
	    	break;
	    case 3:
	    	System.out.println("Account Balance");
	    	customer1.printinfo();
	    	break;
	    case 4:
	    	System.out.println("Deposit History: ");
	    	customer1.deposithistory();
	    	System.out.println("Withdrawal History: ");
	    	customer1.withdrawalhistory();
	    	break;
	    case 5:
	    	System.out.print("Thank you for choosing our bank. Goodbye!");
	    	break outerloop;
	    }
	    }
	    while (true);
	}

}
