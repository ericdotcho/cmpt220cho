
public class lab8prob2 {
	// Main method
		public static void main(String[] args) {
			//Create Account, SavingsAccount and Checking Account objects
			Account account = new Account(1122, 20000);
			SavingsAccount savings = new SavingsAccount(1001, 20000);
			CheckingAccount checking = new CheckingAccount(1004, 20000, -20);
			//Set annual interest rate of 3.15%
			account.setAnnualInterestRate(3.15);
			savings.setAnnualInterestRate(3.15);
			checking.setAnnualInterestRate(3.15);

			//test withdraw of $1,250
			account.withdraw(1250);
			savings.withdraw(1250);
			checking.withdraw(1250);

			//test deposit of $4,000
			account.deposit(4000);
			savings.deposit(4000);
			checking.deposit(4000);

			//invoke toString methods
			System.out.println(account.toString());
			System.out.println(savings.toString());
			System.out.println(checking.toString());
		}
	}
