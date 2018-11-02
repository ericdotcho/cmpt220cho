public class SavingsAccount
		extends Account {
	
	//make a default CheckingAccount object 
	public SavingsAccount() {
		super();
	}

	//create a SavingsAccount with specific id, balance 
	public SavingsAccount(int id, double balance) {
		super(id, balance);
	}

	//decrease balance by amount 
	public void withdraw(double amount) {
		if (amount < getBalance()) {
			setBalance(getBalance() - amount);
		}
		else
			System.out.println("Error! Savings account overdrawn, your transaction has been rejected");
	}
}