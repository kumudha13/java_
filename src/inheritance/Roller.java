package inheritance;

public class Roller extends Enter{

	int Thrill_level;
	public Roller (String n, double t, int l)
	{
		super(n,t);
		Thrill_level = l;
	}
	void display()
	{
		super.display();
		System.out.println("Thrill level : "+ Thrill_level);
	}
}
