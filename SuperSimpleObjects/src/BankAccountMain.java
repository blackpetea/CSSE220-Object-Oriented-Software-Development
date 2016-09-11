
public class BankAccountMain {

	public static void main(String[] args) {
		BankAccount myaccount= new BankAccount(100.56);
		BankAccount mysecaccount= new BankAccount(600);
		//myaccount.setBalance(200.56);
		//mysecaccount.setBalance(80000.56);
		System.out.println("My example is "+myaccount.getBalance());
		System.out.println("My example is "+mysecaccount.getBalance());
	}

}
