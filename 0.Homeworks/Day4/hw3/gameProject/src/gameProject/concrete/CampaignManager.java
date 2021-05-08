package gameProject.concrete;

import gameProject.abstracts.ICampaignService;
import gameProject.entities.Campaign;

public class CampaignManager implements ICampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Added campaign: " + campaign.getCampaignName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Deleted campaign: " + campaign.getCampaignName());
		
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Updated campaign: " + campaign.getCampaignName());
		
	}

}
