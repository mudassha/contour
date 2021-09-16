package dependency.inversion;

import java.util.ArrayList;

public class DependencyInversionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book b = new Book();
		Dvd d = new Dvd();
		Shelf s = new Shelf();
		s.addProduct(b);
		s.addProduct(d);
		
		s.checkReview(b);
		s.checkReview(d);
		
	}

}


interface Product
{
	 void seeReviews();
	 void getSample();
}

class Book implements Product{

	@Override
	public void seeReviews() {
		System.out.println("Review of Book");
		
	}

	@Override
	public void getSample() {
		System.out.println("Sample of Book");
		
	}
	
}

class Dvd implements Product{

	@Override
	public void seeReviews() {
		System.out.println("Review of Dvd");
		
	}

	@Override
	public void getSample() {
		System.out.println("Sample of Dvd");
		
	}
	public void watchSample() {
		System.out.println("Watching Sample of Dvd");
		
	}
	
}

class Shelf {

    ArrayList<Product> products = new ArrayList<Product>();

    void addProduct(Product product) {
          this.products.add(product);
    }
    
    void checkReview(Product product) {
    	product.seeReviews();
    	
    }
    void checkSample(Product product) {
    	product.getSample();
    	
    }
    
}