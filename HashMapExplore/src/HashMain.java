import java.util.*;
public class HashMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> nick_name = new HashMap<String, String>();
		nick_name.put("Saif","Saifi");
		nick_name.put("Sharyar","Shery");
		nick_name.put("Rehan","Mota");
		nick_name.put("Usman","Uzi");
		System.out.println("HashMap before deleting Uzi");
		// Print values
		for (String i : nick_name.keySet()) {
		  System.out.println("key: " + i + " value: " + nick_name.get(i));
		}
		
		
		System.out.println("HashMap after deleting Uzi");
		
		nick_name.remove("Usman");
		for(Map.Entry<String, String> m : nick_name.entrySet())
		{
			String key = m.getKey();
			String value = m.getValue();
			System.out.println("key "+ key + " || value "+value);
		}
			
	}

}
