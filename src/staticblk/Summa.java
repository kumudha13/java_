package staticblk;

public class Summa {
	private int section;
	private static int srNo;
	
	static
	{
		System.out.println("Static Block");
		srNo = 1000;
	}
	  Summa()
	{
		section = 5;
		System.out.println("Default constructor");
		section++;
		srNo++;
		System.out.println("Section No : "+ section);
	}
	static void display()
	{
		System.out.println("Serial No : "+ srNo);
	}
	@Override
	public String toString() {
		return "MyClass [section=" + section + "]";
	}
}
