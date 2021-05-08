package gameProject.abstracts;

import gameProject.entities.Campaign;

public interface ICampaignService {
	
	void add(Campaign campaign);
	void delete(Campaign campaign);
	void update(Campaign campaign);
		
}
