package interfacee;

 interface Bankinterface {
	
	interface  BankInterface {
		 void deposit(double amount);
		 void withdraw(double amount);
		 double getBalance();
		}

		//Define the Bank class that implements the BankInterface
		public class Bank implements BankInterface {
		 private double balance;

		 // Constructor
		 public Bank(double initialBalance) {
		     this.balance = initialBalance;
		 }

		 // Implement the deposit method
		 public void deposit(double amount) {
		     if (amount > 0) {
		         this.balance += amount;
		         System.out.println("Deposited: $" + amount);
		     } else {
		         System.out.println("Invalid deposit amount");
		     }
		 }

		 // Implement the withdraw method
		 public void withdraw(double amount) {
		     if (amount > 0 && amount <= balance) {
		         this.balance -= amount;
		         System.out.println("Withdrawn: $" + amount);
		     } else {
		         System.out.println("Invalid withdrawal amount");
		     }
		 }

		 // Implement the getBalance method
		 public double getBalance() {
		     return this.balance;
		 }

		 // Getter and setter for balance (optional)
		 public void setBalance(double balance) {
		     this.balance = balance;
		 }

		 public static void main(String[] args) {
		     // Create a Bank object with an initial balance of $1000
		     Bank myBank = new Bank(1000);

		     // Deposit and withdraw some money
		     myBank.deposit(500);
		     myBank.withdraw(200);

		     // Get and print the current balance
		     double currentBalance = myBank.getBalance();
		     System.out.println("Current Balance: $" + currentBalance);
		 }
		}
}
