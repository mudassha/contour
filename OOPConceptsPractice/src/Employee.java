
public class Employee extends CommunityMember{
	
	private String employee_company;
	private int employee_id;
	private Address address;
	
	public Employee(String name, int height, int age, String employee_company, int employee_id, Address address) {
		super(name, height, age);
		this.employee_company = employee_company;
		this.employee_id = employee_id;
		this.address = address;
	}
	
	public void setCompany(String employee_company) {
		this.employee_company = employee_company;
	}
	public String getCompany() {
		return employee_company;
	}
	public void setID(int employee_id) {
		this.employee_id = employee_id;
	}
	public int getID() {
		return employee_id;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Address getAddress() {
		return address;
	}
	
	@Override
	public void DisplayDetails() {
		System.out.println("Name : "+super.getName()+"\nHeight(cm) : "+super.getHeight()+"\nAge : "+super.getAge() + "\nEmployee Company : " + employee_company + "\nEmployee ID : "+employee_id);
	}
}
