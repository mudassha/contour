
public class Employee extends CommunityMember{
	
	private String Employee_Company;
	private int Employee_ID;
	
	public Employee(String name, int height, int age, String Employee_Company, int Employee_ID) {
		super(name, height, age);
		this.Employee_Company = Employee_Company;
		this.Employee_ID = Employee_ID;
	}
	
	public void setCompany(String Employee_Company) {
		this.Employee_Company = Employee_Company;
	}
	public String getCompany() {
		return Employee_Company;
	}
	public void setID(int Employee_ID) {
		this.Employee_ID = Employee_ID;
	}
	public int getID() {
		return Employee_ID;
	}
	
	@Override
	public void DisplayDetails() {
		System.out.println("Name : "+super.getName()+"\nHeight(cm) : "+super.getHeight()+"\nAge : "+super.getAge() + "\nEmployee Company : " + Employee_Company + "\nEmployee ID : "+Employee_ID);
	}
}
