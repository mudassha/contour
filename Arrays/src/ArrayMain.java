import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.*;
public class ArrayMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		
		while(x!=0)
		{
			System.out.println("Enter 1 for Array\nEnter 2 for ArrayList\nEnter 3 for LinkedList\nEnter 4 for Vector");
		
			Scanner s = new Scanner(System.in);
			int a = s.nextInt();
		
			if(a == 1)
			{
				Array();
				x = 0;
			}
			else if(a == 2)
			{
				ArrayList();
				x = 0;
			}
			else if(a == 3)
			{
				LinkedList();
				x = 0;
			}
			else if(a == 4)
			{
				Vector();
				x = 0;
			}
			else
			{
				System.out.println("Please enter again!");
			}
		}
				
	} 
	
	public static void Array()
	{
		int[] n = new int[5];
		
		System.out.println("Default value of 0 index of array.");
		System.out.println(n[0]);
		
		n[0] = 15;
		n[1] = 20;
		n[2] = 25;
		n[3] = 30;
		n[4] = 35;
		
		System.out.println("Printed normally from an array.");
		System.out.println(n[0]);
		System.out.println(n[1]);
		System.out.println(n[2]);
		System.out.println(n[3]);	
		System.out.println(n[4]);
		
		System.out.println("Printed through for loop from an array.");
		for(int i=0; i<n.length; i++) {
			System.out.println(n[i]);
		}
	}
	
	public static void ArrayList()
	{
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(150);
		a1.add(200);
		a1.add(250);
		a1.add(300);
		a1.add(350);
		a1.add(400);
		a1.remove(5);
		
		System.out.println("Printed through for-each loop from ArrayList");
		System.out.println("Size of ArrayList = "+ a1.size());
		
		for(int i: a1)
		{
			System.out.println(i);
		}
		
	}
	
	public static void LinkedList()
	{
		LinkedList<String> l1 = new LinkedList<String>();
		l1.add("Monday");
		l1.add("Tuesday");
		l1.add("Wednesday");
		l1.add("Thursday");
		l1.add("Friday");
		l1.add("Saturday");
		l1.add("Sunday");
		l1.add("Holiday");
		l1.remove(new String("Holiday"));
		
		System.out.println("Printed through iterator loop from LinkedList");
		System.out.println("Size of LinkedList = "+ l1.size());
		Iterator<String> itr=l1.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
	}
	
	public static void Vector()
	{
		Vector<String> v1 = new Vector<String>();
		v1.add("January");
		v1.add("February");
		v1.add("March");
		v1.add("April");
		v1.add("May");
		v1.add("June");
		v1.add("July");
		v1.add("August");
		v1.add("September");
		v1.add("October");
		v1.add("November");
		v1.add("December");
		
		Iterator<String> itr=v1.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}
		
		
	}
}


