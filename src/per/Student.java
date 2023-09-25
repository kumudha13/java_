package per;

public class Student extends Person {
	 private int rollNo;
	    private String collegeName;

	    public Student(String name, String aadhar, String address, String phoneNo, int rollNo, String collegeName) {
	        super(name, aadhar, address, phoneNo);
	        this.rollNo = rollNo;
	        this.collegeName = collegeName;
	    }

	    public void displayStudentInfo() {
	        displayDetails();
	        System.out.println("Roll Number: " + rollNo);
	        System.out.println("College Name: " + collegeName);
	    }
	
	

}
