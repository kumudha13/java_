package inheritance;


	
	public class Fstall extends Enter {

		String cuisine;
		public Fstall(String n, double t, String c)
		{
			super(n,t);
			cuisine = c;
		}
		void display()
		{
			super.display();
			System.out.println("Cuisine type : "+ cuisine);
		}
		
	}


