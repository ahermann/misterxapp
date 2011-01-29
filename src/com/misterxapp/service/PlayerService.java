package com.misterxapp.service;

import java.util.List;

import com.misterxapp.model.Player;

/**
 * Provides functionality for accessing players
 */
public interface PlayerService {

	/**
	 * Gets all existing players
	 * @return all players
	 */
	List<Player> getAllPlayers();
	
	/**
	 * Creates a new player
	 * @return created player
	 */
	Player createPlayer();

	/**
	 * Gets an existing player
	 * @param playerId identifier
	 * @return existing player
	 */
	Player getPlayer(Long playerId);

}
