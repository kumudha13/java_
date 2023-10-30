package collection;

public class GeniricDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// generic class with string type datamember
		GenricClass<String>stringobj=new GenricClass<String>();
		stringobj.set("hello");
		System.out.println(stringobj.get());
		//generic class with integer type datamember
		GenricClass<Integer>intobj=new GenricClass<Integer>();
		intobj.set(10);
		System.out.println(intobj.get());
		
	}

}