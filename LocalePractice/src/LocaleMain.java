import java.util.Locale;

public class LocaleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a locale
		Locale l = new Locale("en","Pakistan"); 
		
		//printing locale
	    System.out.println("Locale: " + l);  
	  
	    //printing language
	    System.out.println("Language: " + l.getDisplayLanguage());  
	    
	    //printing country
	    System.out.println("Country: " + l.getCountry()); 
	    
	    //printing hashCode of country
	    System.out.println("HashCode for this locale: " + l.hashCode());
	    
	    //printing all the available locales of country
	    Locale[] available = Locale.getAvailableLocales();
	    for(Locale av : available){
			if(av.getDisplayCountry()=="Pakistan")
			{
				System.out.println("\n\nName of Locale: "+av.getDisplayName());
				System.out.println("Language Code: "+av.getLanguage()+", Language Display Name: "+av.getDisplayLanguage());
				System.out.println("Country Code: "+av.getCountry()+", Country Display Name: "+av.getDisplayCountry());
				
			}
		}

	}

}
