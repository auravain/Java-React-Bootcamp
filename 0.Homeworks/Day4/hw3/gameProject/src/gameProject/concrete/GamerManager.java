package gameProject.concrete;

import gameProject.abstracts.IGamerCheckService;
import gameProject.abstracts.IGamerService;
import gameProject.entities.Gamer;

public class GamerManager implements IGamerService{
	
	private IGamerCheckService iGamerCheckService;
	

	public GamerManager(IGamerCheckService iGamerCheckService) {
		super();
		this.iGamerCheckService = iGamerCheckService;
	}

	@Override
	public void add(Gamer gamer) {
		

		if (iGamerCheckService.checkIfRealPerson(gamer)) {
			System.out.println("Verified User: " + gamer.getFirstName());			
		} 
		
		else {
			System.out.println("Not a valid user");
		}
		
	}

	@Override
	public void delete(Gamer gamer) {
		
		System.out.println("User updated: " + gamer.getFirstName());
		
	}

	@Override
	public void update(Gamer gamer) {
		
		System.out.println("User deleted: " + gamer.getFirstName());
		
	}

}
