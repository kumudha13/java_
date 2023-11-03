package collection;

import java.util.ArrayList;
import java.util.*;
public class Arrr {

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub
         System.out.println("hii");
	 ArrayList<Integer> ob= new ArrayList<Integer>();
	 ob.add(1);
	 ob.add(2);
	 ob.add(3);
	 ob.add(4);
	 Iterator<Integer> it=ob.iterator();
	 while(it.hasNext())
	 {
		 
	 
		 System.out.println( it.next());
	 
	 }
	
	
	}

}
