package exception;

public class Division {
	
		  public static void main()
		  {
			  int a=6,b=0,c;
			  try {
				  c=a/b;
				  System.out.println("division is "+c);
				  }
			  catch(ArrayIndexOutOfBoundsException e)
			  {
				  System.out.println("divsion answer"+e.getMessage());
			  }
		  }
		}


