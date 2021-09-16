package inter.segregation;

public class IsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maid m1 = new Maid();
		m1.cleanHouse();
		m1.doLaundry();

	}

}

interface Cleaner{
	void cleanHouse();
}
interface Cook{
	void cookFood();
}
interface Laundry{
	void doLaundry();
}

class Maid implements Cleaner,Laundry{

	@Override
	public void doLaundry() {
		
		System.out.println("Doing Laundry");
		
	}

	@Override
	public void cleanHouse() {
		
		System.out.println("Cleaning the House");
	}
	
}