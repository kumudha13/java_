package inheritance;

public class Mo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("---Theme Park---");
		Enter  obj = new Enter("Magic show", 50);
		obj.display();
		Enter obj1 = new Roller ("Roller coaster", 30, 7);
		obj1.display();
	    Enter obj2 = new Fstall("Pizza house", 15, "Mexican style");
		obj2.display();
		
	}
}
