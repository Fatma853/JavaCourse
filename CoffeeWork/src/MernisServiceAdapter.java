
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;
import java.rmi.RemoteException;

public class MernisServiceAdapter implements CustomerCheckService {
	
	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		boolean result;
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		try {
			result= client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName().toUpperCase(),
					customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} catch (NumberFormatException e) {
			result = false;
			e.printStackTrace();
		} catch (RemoteException e) {
			result=false;
			e.printStackTrace();
		}
		
		return result; 
	} 
	

}
 