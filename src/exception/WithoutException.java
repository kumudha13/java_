package exception;

public class WithoutException {
public static void main(String[]args)
{
	int d=0;
	try {
		int a=55/0;//exception occurs
		System.out.println("hello");
	}
	catch(ArithmeticException e)
	{System.out.println("hiii");
		
	}
}
}
