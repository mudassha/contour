import java.util.*;
public class ComparableMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Aslam",23));  
		al.add(new Student(106,"Rehman",27));  
		al.add(new Student(105,"Asfand",21));  
		  
		Collections.sort(al);  
		for(Student st:al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}

}

class Student implements Comparable<Student> {  
	int rollno;  
	String name;  
	int age;  
	Student(int rollno,String name,int age)
	{  
		this.rollno=rollno;  
		this.name=name;  
		this.age=age;  
	}  
	public int compareTo(Student st)
	{  
		if(age==st.age)  
			return 0;  
		else if(age>st.age)  
			return 1;  
		else  
			return -1;  
	}  
}  