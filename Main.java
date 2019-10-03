package flexon.java1;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    BankAccount customer1 = new BankAccount();
		Scanner command = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter your command: ");
	    System.out.println("Choose 1 for Withdrawal");
        System.out.println("Choose 2 for Deposit");
        System.out.println("Choose 3 for Account Balance");
        System.out.println("Choose 4 for EXIT");
	    int commandnum = command.nextInt(); 
	    
	    
	    switch(commandnum)
	    {
	    case 1: 
	    	System.out.print("Enter money to be withdrawn: ");
	    	int withdraw = command.nextInt();
	    	customer1.withdraw(withdraw);
	    	break;
	    case 2:
	    	System.out.print("Enter money to be deposited: ");
	    	int deposit = command.nextInt();
	    	customer1.deposit(deposit);
	    	break;
	    case 3:
	    	System.out.print("Account Balance");
	    	int accountbalance = command.nextInt();
	    	customer1.printinfo();
	    	break;
	    case 4:
	    	System.out.print("Now exit");
	    	break;
	    }
	}

}
