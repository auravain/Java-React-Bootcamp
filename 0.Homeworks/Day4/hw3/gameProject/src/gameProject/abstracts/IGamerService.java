package gameProject.abstracts;

import gameProject.entities.Gamer;

public interface IGamerService {
	
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	
}
