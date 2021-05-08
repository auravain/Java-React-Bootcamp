package gameProject.concrete;

import gameProject.abstracts.ISalesService;
import gameProject.entities.Campaign;
import gameProject.entities.Game;
import gameProject.entities.Gamer;

public class SalesManager implements ISalesService {

	@Override
	public void sale(Game game, Gamer gamer) {
		
		System.out.println(gamer.getFirstName() + " is purchased " + game.getGameName() + ".");
		
	}

	@Override
	public void campaignSale(Game game, Gamer gamer, Campaign campaign) {
		
		System.out.println(campaign.getCampaignName() + " is applied to " + game.getGameName() + " by: " + gamer.getFirstName());
		
	}

}
