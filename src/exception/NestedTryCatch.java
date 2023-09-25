package exception;

public class NestedTryCatch {
	 public static void main() {
		  String str="TNS";
		  int slength=str.length();
		  System.out.println("String length"+slength);}
	      String anotherstring=null;
	      int y=6; 
	    	  {try {
	    		  String str;
				System.out.println(str.charAt(y));
	    	  }
	    	  catch(StringIndexOutOfBoundsException ex)
	    	  {
	    		  System.out.println("indexoutofound"+ex.getMessage());
	    		  
	    	  }
	    	  
	    	 catch(NullPointerException npe)
	      {
	    	  System.out.println("Exception is thrown"+npe);
	    	  
	      }
	    	  }
}



