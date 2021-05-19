import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
					
				BaseCustomerManager customerManager= new StarbucksCustomerManager(new MernisServiceAdapter()); 
		        customerManager.save (new Customer(1,"Fatma", "Akkaya", LocalDate.of(1999,11,11), "123165415"));     
	            
	}
		 
		
		
		
	 

}
