
public class BankAccount {
	private double balance;//private makes balance cannot be directly called
	
	public BankAccount(double startingBalance) { 
		/**Constructors; 
		 *No void;
		 *NO return type;
		 *Java can automatically give a "free" constructor;
		 */
		balance=startingBalance;
	}
	
	public double getBalance() {
		/**get the private variable;
		 *toolbar->source->Generate Getters and Setters
		 */
		return this.balance;
	}

	public void setBalance(double balance) {//set the private variable
		this.balance = balance;
	}
}