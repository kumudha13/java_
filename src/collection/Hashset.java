package collection;


import java.util.HashSet;

public class Hashset {
		static void addElements(HashSet<Integer> numberHashSet) {
			numberHashSet.add(61);
			numberHashSet.add(41);
			numberHashSet.add(51);
			numberHashSet.add(91);
			numberHashSet.add(11);
			
			System.out.println(numberHashSet.add(51));// return false
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer>nuberHashSet= new HashSet<Integer>();
		addElements(nuberHashSet);
		HashSet<Integer>nuberHashSet1= new HashSet<Integer>();
		nuberHashSet1.add(20);
		nuberHashSet1.add(80);
		nuberHashSet1.add(11);
		nuberHashSet1.add(11);
		
		System.out.println(nuberHashSet);
		System.out.println(nuberHashSet1);
		
		HashSet<Integer>nuberHashSet2= new HashSet<Integer>();
		addElements(nuberHashSet2);
		
		
		nuberHashSet2.addAll(nuberHashSet1);
		System.out.println("resultset+ "+nuberHashSet2);
		

				nuberHashSet2.retainAll(nuberHashSet1);
				System.out.println("resultset+ "+nuberHashSet2);
		
		
		
				nuberHashSet2.removeAll(nuberHashSet1);
				System.out.println("resultset+ "+nuberHashSet2);
		
		
	}

}
