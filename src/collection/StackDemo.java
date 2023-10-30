package collection;



import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> ob=new Stack<Integer>();
		ob.push(22);
		ob.push(2);
		ob.push(21);
		ob.add(33);
		System.out.println("stack elements"+ ob);
		ob.pop();
		ob.pop();
		System.out.println("stack elements"+ ob);
		// peek() is used to print last element of the stack
		System.out.println(" last stack elements"+ ob.peek());
		// search the stack
		if(ob.isEmpty()) {
			System.out.println(" stack is empty");
			
		}
		else {
			System.out.println(" stack is notempty");
		}
		
		System.out.println(ob.search(2));
		System.out.println(ob.search(55));
		
	}
	
	

}