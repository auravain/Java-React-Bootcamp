package kodlamaio.hrms.core.adapter.concretes;

import java.rmi.RemoteException;

import org.springframework.stereotype.Component;

import kodlamaio.hrms.core.adapter.abstracts.MernisCheckService;
import kodlamaio.hrms.entities.concretes.Candidates;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;


@Component
public class MernisServiceAdapter implements MernisCheckService {

	@Override
	public boolean checkIfRealPerson(Candidates candidates) {
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean check=false;
		try {
			check=client.TCKimlikNoDogrula(
						Long.valueOf(candidates.getNationalId()), 
						candidates.getFirstName(), 
						candidates.getLastName(), 
						candidates.getBirthYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		return check;
		
	}

}