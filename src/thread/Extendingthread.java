package thread;

public class Extendingthread extends Thread 
{
	
public void run() {
	System.out.println("hi BRUH");
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
Extendingthread t = new Extendingthread ();
t.start();

	}

	}