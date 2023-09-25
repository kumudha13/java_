package staticblk;

public class Out {
	
public static void main(String[] args) {
		
		// without creating object static methods can be called.
		Summa.display();
		Summa ob = new Summa();
		System.out.println(ob);
		Summa.display();
	}

}
