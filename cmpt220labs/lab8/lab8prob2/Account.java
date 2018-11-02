import java.util.Date;

public class Account {
	// Data fields
	private int id;
	private double balance;
	private static double annualInterestRate;
	private Date dateCreated;

	// Constructors (creates default account)
	Account() {
		this(0, 0); 
	}

	/** Creates an account with the specified id and initial balance */
	Account(int id, double balance) {
		this.id = id;
		this.balance = balance;
		annualInterestRate = 0;
		dateCreated = new Date();
	}

	public void setId(int id) {
		this.id = id;
	}

	//Set balance 
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/** Set annualInterestRate */
	@SuppressWarnings("static-access")
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	// Accessor methods
	// Return id 
	public int getId() {
		return id;
	}
	
	// returns
	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public String getDateCreated() {
		return dateCreated.toString();
	}

	public double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	// Methods
	public double getMonthlyInterest() {
		return balance * (getMonthlyInterestRate() / 100);
	}

	//decreases balance by amount 
	public void withdraw(double amount) {
		balance -= amount;
	}

	//increases balance by amount 
	public void deposit(double amount) {
		balance += amount;
	}

	//Returns a String description of Account class 
	public String toString() {
		return "\nAccount ID: " + id + "\nDate created: " + getDateCreated()
			+ "\nBalance: $" + String.format("%.2f", balance) + 
			"\nMonthly interest: $" + String.format("%.2f", getMonthlyInterest());
	}
}