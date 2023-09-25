package basic;
import java.util.Scanner;
public class Out {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try (Scanner obj = new Scanner(System.in)) {
			System.out.println("Enter ur Name : ");
			String name = obj.nextLine();
			
			System.out.println("Enter ur Adress : ");
			String Address = obj.nextLine();
			
			System.out.println("Enter ur Phone : ");
			Long Phone = obj.nextLong();
			
			System.out.println("Enter ur Sales amount : ");
			int salesamt = obj.nextInt();
			
			Employee E1 = new Employee();
			E1.setName(name);
			E1.setAdress(Address);
			E1.setPhone(Phone);
			E1.setSales_amount(salesamt);
			
			Calculate C1 = new Calculate();
			C1.calculation(E1);
			System.out.println("Comission calculated for your sales amount is : ");
			System.out.println(E1);
		}

	}
}
