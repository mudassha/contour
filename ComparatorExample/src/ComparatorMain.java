import java.util.*;
public class ComparatorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating a list of students  
		ArrayList<Student> al=new ArrayList<Student>();  
		al.add(new Student(101,"Aslam",23));  
		al.add(new Student(106,"Rehman",27));  
		al.add(new Student(105,"Asfand",21));  
		  
		System.out.println("Sorting by Name");  
		//Using NameComparator to sort the elements  
		Collections.sort(al,new NameComparator());  
		//Traversing the elements of list  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
		  
		System.out.println("sorting by Age");  
		//Using AgeComparator to sort the elements  
		Collections.sort(al,new AgeComparator());  
		//Traversing the list again  
		for(Student st: al){  
		System.out.println(st.rollno+" "+st.name+" "+st.age);  
		}  
	}

}
