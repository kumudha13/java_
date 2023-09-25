package per;

public class Person {
	
	protected String name;
    protected String aadhar;
    protected String address;
    protected String phoneNo;

    public Person(String name, String aadhar, String address, String phoneNo) {
        this.name = name;
        this.aadhar = aadhar;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Aadhar: " + aadhar);
        System.out.println("Address: " + address);
        System.out.println("Phone Number: " + phoneNo);
    }

}
