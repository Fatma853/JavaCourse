

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{ 
	private StarbucksCustomerManager base;
	private StarbucksCustomerManager customerCheckService;

	public StarbucksCustomerManager(MernisServiceAdapter mernisServiceAdapter) {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void save(Customer customer) 
	{
		if (customerCheckService.CheckIfRealPerson(customer)) 
		{
			base.save(customer);
		}
		else 
		{
			System.out.println("Ge�erli bir ki�i de�il.");  
		
		}
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	  
		
		
	

}
