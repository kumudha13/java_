package finall;

public class FinalMethod {
	
	 public final void printMessage() {
	        System.out.println("This method cannot be overridden.");
	    }
	}

	class Subclass extends FinalMethod {
	    // Attempting to override a final method will result in a compilation error
	    // public void printMessage() {
	    //     System.out.println("This method cannot be overridden in the subclass.");
	    // }
	}


