package gameProject.abstracts;

import gameProject.entities.Game;

public interface IGameService {
	
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	
}
