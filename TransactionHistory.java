package flexon.java1;

public class TransactionHistory {
	public String timestamp;
	public double amount;
	
	
	public TransactionHistory(String time, double amounts) {
		timestamp = time;
		amount = amounts;
	}

	public String toString() {
	    return "Time of transaction: " + timestamp + " & Amount: " + amount;
	  }
}
