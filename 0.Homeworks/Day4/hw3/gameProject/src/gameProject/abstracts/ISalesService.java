package gameProject.abstracts;

import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public interface ISalesService {

	void sale(Game game, Gamer gamer);
	void campaignSale(Game game, Gamer gamer, Campaign campaign);
	
}
