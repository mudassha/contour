
public class CommunityMember {
	private String name;
	private int height;
	private int age;
	
	
	public CommunityMember(String name, int height, int age) {
		this.name = name;
		this.height = height;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height=height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public void DisplayDetails() {
		System.out.println("Name : "+name+"\nHeight(cm) : "+height+"\nAge : "+age);
	}
}
