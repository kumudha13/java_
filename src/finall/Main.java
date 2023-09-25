package finall;

public class Main {
	
	 public static final double P = 3;
	    
	    public static void main(String[] args) {
	        System.out.println("The value of PI is: " + P);
	        
	        // Attempting to modify a final variable will result in a compilation error
	        // P= 3; // This line will cause a compilation error
	    }

}
