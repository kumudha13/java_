package collection;



import java.util.ArrayList;
import java.util.Vector;

// program to demonstrate Vector class methods
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v=new Vector<String>();
//		int size=v.size();
//		System.out.println("size of vector"+ size);
		//adding the elements
		v.add("red");
		v.add("green");
		v.add("yellow");
		v.add("white");
		System.out.println("vector elements"+ v);
		int size=v.size();
		
		System.out.println("size of vector"+ size);
		int cap=v.capacity();
		System.out.println("Default capacity"+cap);
		v.addElement(null);// null elements are also allowed
		v.add(5,"pink");
		v.add("white");// Duplicate elements are allowed
		int newsize=v.size();
		System.out.println("size of vector"+ newsize);
		System.out.println("vector elements"+ v);
		
		// create an arraylist with intial capacity 10
		ArrayList<String>al=new ArrayList<String>();
		al.add("black");
		al.add("red");
		al.add("suma");
		al.add("ramya");
//		al.add("manu");
//		al.add("ranu");
		// call addall() to add collection of elements into vector
		v.addAll(al);
		System.out.println("vector elements"+ v);
		int ncap=v.capacity();
		System.out.println("new capacity"+ncap);
		
		
		

	}

}