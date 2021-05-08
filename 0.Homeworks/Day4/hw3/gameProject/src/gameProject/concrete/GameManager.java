package gameProject.concrete;

import gameProject.abstracts.IGameService;
import gameProject.entities.Game;

public class GameManager implements IGameService {
	

	@Override
	public void add(Game game) {
		
		System.out.println("Added game: " + game.getGameName());
		
	}

	@Override
	public void delete(Game game) {
		
		System.out.println("Deleted game: " + game.getGameName());
		
	}

	@Override
	public void update(Game game) {
		
		System.out.println("Updated game: " + game.getGameName());
		
	}

}
