import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating & printing LocalDate object
		LocalDate myObjDate = LocalDate.now();
	    System.out.println("Date : "+myObjDate); 
	    
	    //creating & printing LocalTime object
	    LocalTime myObjTime = LocalTime.now();
	    System.out.println("Time : "+myObjTime);
	    
	    //creating LocalDateTime object
	    LocalDateTime myObjDateTime = LocalDateTime.now();
	  
	    
	    //printing LocalDateTime object before formatting
	    System.out.println("Before formatting: " + myObjDateTime);
	    
	    //using DateTimeFormatter to provide pattern
	    DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	    
	    //creating string to store formatted Date and Time and printing it
	    String formattedDate = myObjDateTime.format(myFormatObj);
	    System.out.println("After formatting: " + formattedDate);
	}

}
