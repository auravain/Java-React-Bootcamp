package gameProject;

import java.time.LocalDate;

import gameProject.abstracts.IGameService;
import gameProject.abstracts.ISalesService;
import gameProject.adapters.MernisServiceAdapter;
import gameProject.concrete.CampaignManager;
import gameProject.concrete.GameManager;
import gameProject.concrete.GamerManager;
import gameProject.concrete.SalesManager;
import gameProject.entities.Game;
import gameProject.entities.Gamer;
import gameProject.entities.Campaign;

public class Main {

	public static void main(String[] args) {
		
		GamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.add(new Gamer(1, "Ýlknur", "Sucaklý", LocalDate.of(1994, 12, 7), "59116388786"));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		IGameService iGameService = new GameManager();
		iGameService.add(new Game(1, "Valheim", 32));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.add(new Campaign(1, "Weekend Offer", "The offer is valid on Saturday and Sunday.", 10 ));
		
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		
		ISalesService iSalesService = new SalesManager();
		iSalesService.sale(new Game(1, "Valheim", 32),new Gamer(1, "Ýlknur", "Sucaklý", LocalDate.of(1994, 12, 7), "59116388786"));
		
	
	}

}
