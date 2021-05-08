package gameProject.adapters;

import java.rmi.RemoteException;

import gameProject.abstracts.IGamerCheckService;
import gameProject.entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		
		try {
			return client.TCKimlikNoDogrula(Long.parseLong(gamer.nationalityId), gamer.firstName.toUpperCase(), 
					gamer.lastName.toUpperCase(), gamer.dateOfBirth.getYear());
		} catch (RemoteException e) {
			
			e.printStackTrace();
		}
		return false;
		
	}

}
