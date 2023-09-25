package exception;

public class UserDefinedExceptionExample {
	 public static void main(String[] args) {
	        try {
	            int balance = 100;
	            int withdrawAmount = 200;

	            if (withdrawAmount > balance) {
	                throw new Exception("Insufficient balance");
	            } else {
	                balance -= withdrawAmount;
	                System.out.println("Withdrawal successful. Updated balance: " + balance);
	            }
	        } catch (Exception e) {
	            System.out.println("CustomException: " + e.getMessage());
	        }
	    }
}
