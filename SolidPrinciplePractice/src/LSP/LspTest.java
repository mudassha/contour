package LSP;

import java.util.ArrayList;
import java.util.List;

public class LspTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<FlightBirds>  flightBirdList = new ArrayList<FlightBirds>();
	    flightBirdList.add(new FlightBirds());
	    flightBirdList.add( new Crow());
	    
	    letTheBirdsFly ( flightBirdList );
	  }
	  static void letTheBirdsFly ( List<FlightBirds> fbird ){
	    for ( FlightBirds b : fbird ) {
	      b.fly();
	    }
	  }

	}


